package br.instrumentosmusicais.pdv.DAO;

import br.instrumentosmusicais.pdv.model.Cliente;
import br.instrumentosmusicais.pdv.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
            instrucaoSQL.setString(6, cad.getNasc());
            instrucaoSQL.setString(7, cad.getEmail());
            instrucaoSQL.setString(8, cad.getSexo());

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
    
}
