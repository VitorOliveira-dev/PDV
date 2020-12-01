package br.instrumentosmusicais.pdv.DAO;

import br.instrumentosmusicais.pdv.model.Cliente;
import br.instrumentosmusicais.pdv.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroClienteDAO {

    public static boolean salvarCliente(Cliente cad) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("INSERT INTO Cliente (nome, CPF, endereco, cidade, telefone, data_nasc, email, sexo) VALUES(?,?,?,?,?,?,?,?)");

            instrucaoSQL.setString(1, cad.getNomeCliente());
            instrucaoSQL.setString(2, cad.getCPF());
            instrucaoSQL.setString(3, cad.getEndereco());
            instrucaoSQL.setString(4, cad.getCidade());
            instrucaoSQL.setString(5, cad.getTelefone());
            instrucaoSQL.setDate(6, new java.sql.Date(cad.getNasc().getTime()));
            instrucaoSQL.setString(7, cad.getEmail());
            instrucaoSQL.setString(8, cad.getSexo());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException | NullPointerException ex ) {
            System.out.println("ERROR " + ex.getMessage());
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

    public static boolean atualizarCliente(Cliente cad) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("UPDATE Cliente SET  nome = ?, CPF = ?, endereco = ?, cidade = ?, telefone = ?, data_nasc = ?, email = ? , sexo = ? WHERE cod_cliente = ?");

            instrucaoSQL.setString(1, cad.getNomeCliente());
            instrucaoSQL.setString(2, cad.getCPF());
            instrucaoSQL.setString(3, cad.getEndereco());
            instrucaoSQL.setString(4, cad.getCidade());
            instrucaoSQL.setString(5, cad.getTelefone());
            instrucaoSQL.setDate(6, new java.sql.Date(cad.getNasc().getTime()));
            instrucaoSQL.setString(7, cad.getEmail());
            instrucaoSQL.setString(8, cad.getSexo());
            instrucaoSQL.setInt(9, cad.getCodCliente());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("ERRO" + ex);
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

    public static Cliente consultarCliente(int codCliente) {

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        Cliente consultar = null;
        ResultSet rs = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM Cliente WHERE cod_Cliente = ?");
            instrucaoSQL.setInt(1, codCliente);

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                consultar = new Cliente();
                consultar.setCodCliente(rs.getInt("cod_cliente"));
                consultar.setNomeCliente(rs.getString("nome"));
                consultar.setCPF(rs.getString("cpf"));
                consultar.setEndereco(rs.getString("endereco"));
                consultar.setCidade(rs.getString("cidade"));
                consultar.setTelefone(rs.getString("telefone"));
                consultar.setNasc(rs.getDate("data_nasc"));
                consultar.setEmail(rs.getString("email"));
                consultar.setSexo(rs.getString("sexo"));
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("ERROR "+ex);
            consultar = null;
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

        return consultar;

    }

}
