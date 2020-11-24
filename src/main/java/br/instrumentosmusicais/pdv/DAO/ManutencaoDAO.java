package br.instrumentosmusicais.pdv.DAO;

import br.instrumentosmusicais.pdv.model.Cliente;
import br.instrumentosmusicais.pdv.model.Produto;
import br.instrumentosmusicais.pdv.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ManutencaoDAO {

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
