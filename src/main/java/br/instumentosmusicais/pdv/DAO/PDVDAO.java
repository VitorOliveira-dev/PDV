package br.instumentosmusicais.pdv.DAO;

import br.instumentosmusicais.pdv.model.Cliente;
import br.instumentosmusicais.pdv.model.Produto;
import br.instumentosmusicais.pdv.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PDVDAO {

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
    
    public static ArrayList<Cliente> manutencaoPesquisarTodosClientes(){
        
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
        }finally{

            //Libero os recursos da memória
            try {
                if(comandoSQL!=null)
                    comandoSQL.close();

                GerenciadorConexao.fecharConexao();

              } catch (SQLException ex) {
             }
        }

        return listaClientes;
    
    }
    
    public static Cliente manutencaoPesquisarCliente(String pNome){
        Cliente retorno = null;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {

           conexao = GerenciadorConexao.abrirConexao();

            comandoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE nome = ?");
            comandoSQL.setString(1, pNome);

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                retorno = new Cliente();
                retorno.setCodCliente(rs.getInt("cod_cliente"));
                retorno.setNomeCliente(rs.getString("nome"));
                retorno.setCPF(rs.getString("cpf"));
                retorno.setTelefone(rs.getString("telefone"));
            }

        } catch (Exception e) {
            retorno = null;
        }finally{

            //Libero os recursos da memória
            try {
                if(comandoSQL!=null)
                    comandoSQL.close();

                GerenciadorConexao.fecharConexao();

              } catch (SQLException ex) {
             }
        }
        return retorno;
        
    }
    
    public static ArrayList<Produto> manutencaoPesquisarTodosProdutos(){
        
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

                listaProdutos.add(obj);
            }

        } catch (Exception e) {
            listaProdutos = null;
        }finally{

            //Libero os recursos da memória
            try {
                if(comandoSQL!=null)
                    comandoSQL.close();

                GerenciadorConexao.fecharConexao();

              } catch (SQLException ex) {
             }
        }

        return listaProdutos;
    
    }
    
    public static Produto manutencaoPesquisarProduto(String pInstrumento){
        Produto retorno = null;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {

           conexao = GerenciadorConexao.abrirConexao();

            comandoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE instrumento = ?");
            comandoSQL.setString(1, pInstrumento);

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                retorno = new Produto();
                
                retorno.setCodProduto(rs.getInt("cod_produto"));
                retorno.setInstrumento(rs.getString("instrumento"));
                retorno.setCor(rs.getString("cor"));
                retorno.setFabricante(rs.getString("fabricante"));
                retorno.setTipo(rs.getString("tipo"));
                retorno.setQuantidade(rs.getInt("qtd"));
                
            }

        } catch (Exception e) {
            retorno = null;
        }finally{
            
            try {
                if(comandoSQL!=null)
                    comandoSQL.close();

                GerenciadorConexao.fecharConexao();

              } catch (SQLException ex) {
             }
        }
        return retorno;
        
    }
    
    public static boolean excluirCliente(int pCodCliente){
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
        }finally{

            //Libero os recursos da memória
            try {
                if(comandoSQL!=null)
                    comandoSQL.close();

                GerenciadorConexao.fecharConexao();

              } catch (SQLException ex) {
             }
        }

        return retorno;
    }
    
    public static boolean excluirProduto(int pCodProduto){
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
        }finally{

            //Libero os recursos da memória
            try {
                if(comandoSQL!=null)
                    comandoSQL.close();

                GerenciadorConexao.fecharConexao();

              } catch (SQLException ex) {
             }
        }

        return retorno;
    }
    }
        

     
   


