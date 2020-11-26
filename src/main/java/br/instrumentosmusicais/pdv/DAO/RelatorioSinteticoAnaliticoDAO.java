/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.instrumentosmusicais.pdv.DAO;

import br.instrumentosmusicais.pdv.model.RelatorioSintetico;
import br.instrumentosmusicais.pdv.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Computador
 */
public class RelatorioSinteticoAnaliticoDAO {
    
    public static ResultSet pesquisarCliente(int cod) {
        
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(
                "Select * From venda " +
                "Inner join cliente " +
                "on venda.fk_cod_cliente = cliente.cod_cliente " +
                "where venda.cod_venda = ?;"
            );
            comandoSQL.setInt(1, cod);
            rs = comandoSQL.executeQuery();  
            

        } catch (ClassNotFoundException | SQLException e) {
            rs = null;
            System.out.println("ERRO "+e);
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

        return rs;

    }
}
