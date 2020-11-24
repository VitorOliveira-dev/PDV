package br.instrumentosmusicais.pdv.DAO;

import br.instrumentosmusicais.pdv.model.RelatorioSintetico;
import br.instrumentosmusicais.pdv.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

                obj.setDataVenda(rs.getString("data_venda"));
                obj.setCodVenda(rs.getInt("cod_venda"));
                obj.setNome(rs.getString("nome"));
                obj.setTotalVenda(rs.getFloat("valor_total"));

                listaVendas.add(obj);
            }

        } catch (Exception e) {
            listaVendas = null;
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
