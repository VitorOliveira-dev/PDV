package br.instumentosmusicais.pdv.DAO;

import br.instumentosmusicais.pdv.model.Cliente;
import br.instumentosmusicais.pdv.model.Produto;
import br.instumentosmusicais.pdv.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

}
