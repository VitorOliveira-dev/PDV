package br.instrumentosmusicais.pdv.DAO;

import br.instrumentosmusicais.pdv.model.Cliente;
import br.instrumentosmusicais.pdv.model.ItensVenda;
import br.instrumentosmusicais.pdv.model.Produto;
import br.instrumentosmusicais.pdv.model.Venda;
import br.instrumentosmusicais.pdv.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VendaDAO {

    public static boolean vendaVender(Venda pVenda) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();

            comandoSQL = conexao.prepareStatement("INSERT INTO Venda(data_venda, valor_total, fk_cod_cliente) VALUES (NOW(), ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            comandoSQL.setFloat(1, pVenda.getTotalVenda());
            comandoSQL.setInt(2, pVenda.getCodCliente());

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet pk = comandoSQL.getGeneratedKeys();
                if (pk.next()) {
                    pVenda.setCodVenda(pk.getInt(1));

                    for (ItensVenda item : pVenda.getListaItens()) {

                        PreparedStatement comandoSQLItens = conexao.prepareStatement("INSERT INTO pedido (fk_cod_produto, fk_cod_cliente,fk_cod_venda, qtd_vend, valor_un) VALUES (?,?,?,?,?)",
                                Statement.RETURN_GENERATED_KEYS);

                        comandoSQLItens.setInt(1, item.getCodProduto());
                        comandoSQLItens.setInt(2, pVenda.getCodCliente());
                        comandoSQLItens.setInt(3, pVenda.getCodVenda());
                        comandoSQLItens.setInt(4, item.getQtd_vendida());
                        comandoSQLItens.setFloat(5, item.getValorUnitario());

                        int itensAfetados = comandoSQLItens.executeUpdate();
                        if (itensAfetados < 0) {
                            throw new SQLException("Falha ao inserir itens do pedido");
                        }
                    }
                } else {
                    throw new SQLException("Falha ao obter o ID da venda");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR " + e.getMessage());
            retorno = false;
        } finally {
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();

                    GerenciadorConexao.fecharConexao();
                }
            } catch (SQLException e) {
            }
        }

        return retorno;
    }

    public static ArrayList<Cliente> vendaBuscarCliente(String pNome, String pCPF) {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE CPF LIKE ? OR nome LIKE ?");
            comandoSQL.setString(1, pCPF);
            comandoSQL.setString(2, pNome);

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                Cliente obj = new Cliente();

                obj.setCodCliente(rs.getInt("cod_cliente"));
                obj.setNomeCliente(rs.getString("nome"));
                obj.setCPF(rs.getString("CPF"));

                listaClientes.add(obj);
            }

        } catch (ClassNotFoundException | SQLException e) {
            listaClientes = null;
            System.out.println("ERROR " + e);
        } finally {

            //Libero os recursos da memória
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
                System.out.println("ERROR " + ex);
            }
        }

        return listaClientes;

    }

    public static ArrayList<Produto> vendaBuscarProduto(String pCodigo, String pInstrumento) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE cod_produto LIKE ? OR instrumento LIKE ?");
            comandoSQL.setString(1, pCodigo);
            comandoSQL.setString(2, pInstrumento);

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                Produto obj = new Produto();
                obj.setCodProduto(rs.getInt("cod_produto"));
                obj.setInstrumento(rs.getString("instrumento"));
                obj.setValor(rs.getFloat("valor"));

                listaProdutos.add(obj);
            }

        } catch (Exception e) {
            listaProdutos = null;
        } finally {

            //Libero os recursos da memória
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
                System.out.println("ERROR " + ex);
            }
        }

        return listaProdutos;

    }
}
