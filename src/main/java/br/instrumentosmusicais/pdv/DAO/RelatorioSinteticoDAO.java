package br.instrumentosmusicais.pdv.DAO;

import br.instrumentosmusicais.pdv.model.RelatorioSintetico;
import br.instrumentosmusicais.pdv.utils.GerenciadorConexao;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class RelatorioSinteticoDAO {
    
    public static ArrayList<RelatorioSintetico> pesquisaMes(int mes) {

        ArrayList<RelatorioSintetico> listaVendas = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT data_venda, cod_venda, nome, valor_total FROM Venda INNER JOIN Cliente WHERE MONTH(data_venda) = ?;");
            comandoSQL.setInt(1, mes);

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                RelatorioSintetico obj = new RelatorioSintetico();

                obj.setDataVenda(rs.getDate("data_venda"));
                obj.setCodVenda(rs.getInt("cod_venda"));
                obj.setNome(rs.getString("nome"));
                obj.setTotalVenda(rs.getFloat("valor_total"));

                listaVendas.add(obj);
            }

        } catch (ClassNotFoundException | SQLException e) {
            listaVendas = null;
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

        return listaVendas;

    }
    
    
    
    public static ArrayList<RelatorioSintetico> pesquisaPersonalizada(Date dataInicio, Date dataFinal) {

        ArrayList<RelatorioSintetico> listaVendas = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(
                "SELECT DATE(data_venda) as data_venda, cod_venda, nome, valor_total " +
                "FROM Venda " +
                "INNER JOIN Cliente WHERE data_venda between ? and ?;"
            );
            comandoSQL.setDate(1, new java.sql.Date( dataInicio.getTime() ));
            comandoSQL.setDate(2, new java.sql.Date( dataFinal.getTime() ));

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                RelatorioSintetico obj = new RelatorioSintetico();

                obj.setDataVenda(rs.getDate("data_venda"));
                obj.setCodVenda(rs.getInt("cod_venda"));
                obj.setNome(rs.getString("nome"));
                obj.setTotalVenda(rs.getFloat("valor_total"));

                listaVendas.add(obj);
            }

        } catch (ClassNotFoundException | SQLException e) {
            listaVendas = null;
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

        return listaVendas;

    }
    
    
    
}
