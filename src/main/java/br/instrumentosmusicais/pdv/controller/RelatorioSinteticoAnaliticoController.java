/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.instrumentosmusicais.pdv.controller;

import br.instrumentosmusicais.pdv.DAO.RelatorioSinteticoAnaliticoDAO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Computador
 */
public class RelatorioSinteticoAnaliticoController {
    public static ArrayList<String[]> pesquisaCliente(int cod) {
        ResultSet cliente = RelatorioSinteticoAnaliticoDAO.pesquisarCliente(cod);
        ArrayList<String[]> retorno = new ArrayList<>();

        for (RelatorioSinteticoAnalitico obj : cliente) {
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
