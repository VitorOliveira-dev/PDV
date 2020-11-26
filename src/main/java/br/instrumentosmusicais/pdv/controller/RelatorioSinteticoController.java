package br.instrumentosmusicais.pdv.controller;

import br.instrumentosmusicais.pdv.DAO.RelatorioSinteticoDAO;
import br.instrumentosmusicais.pdv.model.Cliente;
import br.instrumentosmusicais.pdv.model.RelatorioSintetico;
import br.instrumentosmusicais.pdv.model.Venda;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.util.Date;

public class RelatorioSinteticoController {
 
    public static ArrayList<String[]> pesquisaMes(int mes) {
        ArrayList<RelatorioSintetico> listaCompras = RelatorioSinteticoDAO.pesquisaMes(mes);
        ArrayList<String[]> retorno = new ArrayList<>();

        for (RelatorioSintetico obj : listaCompras) {
            retorno.add(new String[]{
                String.valueOf(obj.getDataVenda()),
                String.valueOf(obj.getCodVenda()),
                String.valueOf(obj.getNome()),
                String.valueOf(obj.getTotalVenda())
            });

        }
        return retorno;

    }
    
    public static ArrayList<String[]> pesquisaPersonalizada(Date dataInicio, Date dataFinal) {
        ArrayList<RelatorioSintetico> listaCompras = RelatorioSinteticoDAO.pesquisaPersonalizada(dataInicio, dataFinal);
        ArrayList<String[]> retorno = new ArrayList<>();

        for (RelatorioSintetico obj : listaCompras) {
            retorno.add(new String[]{
                String.valueOf(obj.getDataVenda()),
                String.valueOf(obj.getCodVenda()),
                String.valueOf(obj.getNome()),
                String.valueOf(obj.getTotalVenda())
            });

        }
        return retorno;

    }
    
    
    public static String[] analitico(int cod){
        String[] dados = RelatorioSinteticoDAO.pesquisarCliente(cod);
                
        return dados;
    }
    
    public static ArrayList<String[]>analiticoProduto(int cod){
        
        ArrayList<String[]> dados = RelatorioSinteticoDAO.pesquisarProduto(cod);        
        
        return dados;
    }
    
    
}
