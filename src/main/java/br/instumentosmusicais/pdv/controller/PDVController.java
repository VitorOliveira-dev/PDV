package br.instumentosmusicais.pdv.controller;

import br.instumentosmusicais.pdv.DAO.PDVDAO;
import br.instumentosmusicais.pdv.model.Cliente;
import br.instumentosmusicais.pdv.model.Produto;

public class PDVController {

    public static String[] vendaBuscarCliente(String nome, String CPF) {
        Cliente obj = PDVDAO.vendaBuscarCliente(nome, CPF);
        String[] retorno = null;

        if (obj != null) {
            retorno = new String[]{
                String.valueOf(obj.getNomeCliente()),
                String.valueOf(obj.getCPF())};
        }
        return retorno;
    }

    public static String[] vendaBuscarProduto(int codigo, String instrumento) {
        Produto obj = PDVDAO.vendaBuscarProduto(codigo, instrumento);
        String[] retorno = null;

        if (obj != null) {
            retorno = new String[]{
                String.valueOf(obj.getCodProduto()),
                String.valueOf(obj.getInstrumento()),
                String.valueOf(obj.getValor())};
        }
        return retorno;
    }

}
