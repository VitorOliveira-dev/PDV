package br.instrumentosmusicais.pdv.DAO;
import br.instrumentosmusicais.pdv.model.RelatorioSintetico;
import br.instrumentosmusicais.pdv.utils.GerenciadorConexao;
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
            comandoSQL = conexao.prepareStatement("SELECT data_venda, cod_venda, nome, valor_total FROM Venda INNER JOIN Cliente on Venda.fk_cod_cliente = Cliente.cod_cliente WHERE MONTH(data_venda) = ?");
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
            System.out.println("ERRO " + e);
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
                    "SELECT DATE(data_venda) as data_venda, cod_venda, nome, valor_total FROM Venda INNER JOIN Cliente on Venda.fk_cod_cliente = Cliente.cod_cliente WHERE data_venda between ? and ?"
            );
            comandoSQL.setDate(1, new java.sql.Date(dataInicio.getTime()));
            comandoSQL.setDate(2, new java.sql.Date(dataFinal.getTime()));

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
            System.out.println("ERRO " + e);
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

    public static String[] pesquisarCliente(int cod) {
        String[] dados = new String[9];
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(
                    "Select cod_venda, data_venda, valor_total, nome, cpf, endereco, cidade, telefone, email "
                    + "From venda "
                    + "Inner join cliente "
                    + "on venda.fk_cod_cliente = cliente.cod_cliente "
                    + "where venda.cod_venda = ?;"
            );
            comandoSQL.setInt(1, cod);
            rs = comandoSQL.executeQuery();
            while (rs.next()) {

                dados[0] = String.valueOf(rs.getInt("cod_venda"));
                dados[1] = String.valueOf(rs.getDate("data_venda"));
                dados[2] = String.valueOf(rs.getFloat("valor_total"));
                dados[3] = String.valueOf(rs.getString("nome"));
                dados[4] = String.valueOf(rs.getString("cpf"));
                dados[5] = String.valueOf(rs.getString("endereco"));
                dados[6] = String.valueOf(rs.getString("cidade"));
                dados[7] = String.valueOf(rs.getString("telefone"));
                dados[8] = String.valueOf(rs.getString("email"));

            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERRO " + e);
            rs = null;
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

        return dados;

    }

    public static ArrayList<String[]> pesquisarProduto(int cod) {
        ArrayList<String[]> dados = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            comandoSQL = conexao.prepareStatement(
                    "Select cod_produto, instrumento,valor_un, qtd_vend,(valor_un*qtd_vend) as total From pedido "
                    + "Inner join produto "
                    + "on pedido.fk_cod_produto = produto.cod_produto "
                    + "where pedido.fk_cod_venda = ?"
            );
            comandoSQL.setInt(1, cod);
            rs = comandoSQL.executeQuery();
            while (rs.next()) {
                dados.add(new String[]{
                    String.valueOf(rs.getInt("cod_produto")),
                    String.valueOf(rs.getString("instrumento")),
                    String.valueOf(rs.getFloat("valor_un")),
                    String.valueOf(rs.getInt("qtd_vend")),
                    String.valueOf(rs.getFloat("total"))
                });

            }

        } catch (ClassNotFoundException | SQLException e) {
            rs = null;
            System.out.println("ERRO " + e);
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

        return dados;

    }
}
