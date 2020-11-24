package br.instrumentosmusicais.pdv.controller;

import br.instrumentosmusicais.pdv.DAO.PDVDAO;
import br.instrumentosmusicais.pdv.model.RelatorioSintetico;
import java.util.ArrayList;

public class RelatorioSinteticoController {
 
        public static ArrayList<String[]> pesquisaMes(int mes) {
        ArrayList<RelatorioSintetico> listaCompras = PDVDAO.pesquisaMes(mes);
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
}
