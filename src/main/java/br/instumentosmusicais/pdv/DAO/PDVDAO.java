package br.instumentosmusicais.pdv.DAO;

import br.instumentosmusicais.pdv.model.Cliente;
import br.instumentosmusicais.pdv.model.ItensVenda;
import br.instumentosmusicais.pdv.model.Produto;
import br.instumentosmusicais.pdv.model.Venda;
import br.instumentosmusicais.pdv.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PDVDAO {

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

    public static boolean salvarProduto(Produto obj) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("INSERT INTO Produto (instrumento,cor,tipo,fabricante,qtd,valor) VALUES(?,?,?,?,?,?)");

            instrucaoSQL.setString(1, obj.getInstrumento());
            instrucaoSQL.setString(2, obj.getCor());
            instrucaoSQL.setString(3, obj.getTipo());
            instrucaoSQL.setString(4, obj.getFabricante());
            instrucaoSQL.setInt(5, obj.getQuantidade());
            instrucaoSQL.setFloat(6, obj.getValor());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                if (conexao != null) {
                    GerenciadorConexao.fecharConexao();
                }

            } catch (SQLException ex) {
            }
        }

        return retorno;

    }

    public static boolean atualizarProduto(Produto obj) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("UPDATE Produto SET instrumento = ? ,  cor = ? , tipo = ? , fabricante = ? , qtd = ? , valor = ? WHERE cod_produto = ?");

            instrucaoSQL.setString(1, obj.getInstrumento());
            instrucaoSQL.setString(2, obj.getCor());
            instrucaoSQL.setString(3, obj.getTipo());
            instrucaoSQL.setString(4, obj.getFabricante());
            instrucaoSQL.setInt(5, obj.getQuantidade());
            instrucaoSQL.setFloat(6, obj.getValor());
            instrucaoSQL.setInt(7, obj.getCodProduto());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                if (conexao != null) {
                    GerenciadorConexao.fecharConexao();
                }

            } catch (SQLException ex) {
            }
        }

        return retorno;

    }

    public static Produto consultarPorID(int idProduto) {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        Produto instrumento = null;
        ResultSet rs = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM Produto WHERE cod_produto = ?");
            instrucaoSQL.setInt(1, idProduto);

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                instrumento = new Produto();
                instrumento.setCodProduto(rs.getInt("cod_produto"));
                instrumento.setInstrumento(rs.getString("instrumento"));
                instrumento.setCor(rs.getString("cor"));
                instrumento.setTipo(rs.getString("tipo"));
                instrumento.setFabricante(rs.getString("fabricante"));
                instrumento.setQuantidade(rs.getInt("qtd"));
                instrumento.setValor(rs.getFloat("valor"));

            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            instrumento = null;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                if (conexao != null) {
                    GerenciadorConexao.fecharConexao();
                }

            } catch (SQLException ex) {
            }
        }

        return instrumento;

    }

    public static Cliente vendaBuscarCliente(String pNome, String pCPF) {

        Cliente retorno = null;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM Cliente WHERE nome=? OR CPF=?");
            comandoSQL.setString(1, pNome);
            comandoSQL.setString(2, pCPF);

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                retorno = new Cliente();
                retorno.setCodCliente(rs.getInt("cod_cliente"));
                retorno.setNomeCliente(rs.getString("Nome"));
                retorno.setCPF(rs.getString("CPF"));
            }

        } catch (Exception e) {
            retorno = null;
        } finally {
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }
        return retorno;
    }

    public static Produto vendaBuscarProduto(int pCodigo, String pInstrumento) {

        Produto retorno = null;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM Produto WHERE cod_produto=? OR instrumento=?");
            comandoSQL.setInt(1, pCodigo);
            comandoSQL.setString(2, pInstrumento);

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                retorno = new Produto();
                retorno.setCodProduto(rs.getInt("cod_produto"));
                retorno.setInstrumento(rs.getString("instrumento"));
                retorno.setValor(rs.getFloat("valor"));
            }

        } catch (Exception e) {
            retorno = null;
        } finally {
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }
        return retorno;

    }

    public static ArrayList<Cliente> manutencaoPesquisarTodosClientes() {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM cliente");

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                Cliente obj = new Cliente();

                obj.setCodCliente(rs.getInt("cod_cliente"));
                obj.setNomeCliente(rs.getString("nome"));
                obj.setCPF(rs.getString("CPF"));
                obj.setTelefone(rs.getString("telefone"));

                listaClientes.add(obj);
            }

        } catch (Exception e) {
            listaClientes = null;
        } finally {

            //Libero os recursos da memória
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return listaClientes;

    }

    public static ArrayList<Cliente> manutencaoPesquisarCliente(String pNome) {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?");
            comandoSQL.setString(1, pNome);

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                Cliente obj = new Cliente();

                obj.setCodCliente(rs.getInt("cod_cliente"));
                obj.setNomeCliente(rs.getString("nome"));
                obj.setCPF(rs.getString("CPF"));
                obj.setTelefone(rs.getString("telefone"));

                listaClientes.add(obj);
            }

        } catch (Exception e) {
            listaClientes = null;
        } finally {

            //Libero os recursos da memória
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return listaClientes;

    }

    public static ArrayList<Produto> manutencaoPesquisarTodosProdutos() {

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM produto");

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                Produto obj = new Produto();

                obj.setCodProduto(rs.getInt("cod_produto"));
                obj.setInstrumento(rs.getString("instrumento"));
                obj.setCor(rs.getString("cor"));
                obj.setFabricante(rs.getString("fabricante"));
                obj.setTipo(rs.getString("tipo"));
                obj.setQuantidade(rs.getInt("qtd"));
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
            }
        }

        return listaProdutos;

    }

    public static ArrayList<Produto> manutencaoPesquisarProduto(String pInstrumento) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE instrumento=?");
            comandoSQL.setString(1, pInstrumento);

            rs = comandoSQL.executeQuery();

            while (rs.next()) {

                Produto obj = new Produto();

                obj.setCodProduto(rs.getInt("cod_produto"));
                obj.setInstrumento(rs.getString("instrumento"));
                obj.setCor(rs.getString("cor"));
                obj.setFabricante(rs.getString("fabricante"));
                obj.setTipo(rs.getString("tipo"));
                obj.setQuantidade(rs.getInt("qtd"));

                listaProdutos.add(obj);
                Produto retorno = new Produto();

                retorno.setCodProduto(rs.getInt("cod_produto"));
                retorno.setInstrumento(rs.getString("instrumento"));
                retorno.setCor(rs.getString("cor"));
                retorno.setFabricante(rs.getString("fabricante"));
                retorno.setTipo(rs.getString("tipo"));
                retorno.setQuantidade(rs.getInt("qtd"));
                retorno.setValor(rs.getFloat("valor"));

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
            }
        }

        return listaProdutos;

    }

    public static boolean manutencaoExcluirCliente(int pCodCliente) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();

            comandoSQL = conexao.prepareStatement("DELETE FROM cliente WHERE cod_cliente = ?");
            comandoSQL.setInt(1, pCodCliente);

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static boolean manutencaoExcluirProduto(int pCodProduto) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();

            comandoSQL = conexao.prepareStatement("DELETE FROM produto WHERE cod_produto = ?");
            comandoSQL.setInt(1, pCodProduto);

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

}
