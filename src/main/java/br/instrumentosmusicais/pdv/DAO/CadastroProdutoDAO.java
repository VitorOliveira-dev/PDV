package br.instrumentosmusicais.pdv.DAO;

import br.instrumentosmusicais.pdv.model.Produto;
import br.instrumentosmusicais.pdv.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroProdutoDAO {

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

}
