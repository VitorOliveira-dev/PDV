package br.instrumentosmusicais.pdv.controller;

import br.instrumentosmusicais.pdv.DAO.CadastroProdutoDAO;
import br.instrumentosmusicais.pdv.model.Produto;

public class CadastroProdutoController {

    public static boolean salvarProduto(String instrumento, String cor, String tipo, String fabricante, int quantidade, float valor) {

        boolean retorno = false;

        Produto objProduto = new Produto();
        objProduto.setInstrumento(instrumento);
        objProduto.setCor(cor);
        objProduto.setTipo(tipo);
        objProduto.setFabricante(fabricante);
        objProduto.setQuantidade(quantidade);
        objProduto.setValor(valor);
        return CadastroProdutoDAO.salvarProduto(objProduto);

    }

    public static boolean atualizarProduto(int idProduto, String instrumento, String cor, String tipo, String fabricante, int quantidade, float valor) {
        Produto objProduto = new Produto();

        objProduto.setCodProduto(idProduto);
        objProduto.setInstrumento(instrumento);
        objProduto.setCor(cor);
        objProduto.setTipo(tipo);
        objProduto.setFabricante(fabricante);
        objProduto.setQuantidade(quantidade);
        objProduto.setValor(valor);
        return CadastroProdutoDAO.atualizarProduto(objProduto);

    }

    public static String[] consultarPorID(int idProduto) {

        Produto objInstrumento = CadastroProdutoDAO.consultarPorID(idProduto);

        String[] instrumentoRetorno = null;

        if (objInstrumento != null) {
            instrumentoRetorno = new String[]{String.valueOf(objInstrumento.getCodProduto()),
                String.valueOf(objInstrumento.getInstrumento()),
                String.valueOf(objInstrumento.getCor()),
                String.valueOf(objInstrumento.getTipo()),
                String.valueOf(objInstrumento.getFabricante()),
                String.valueOf(objInstrumento.getQuantidade()),
                String.valueOf(objInstrumento.getValor())
            };

        }

        return instrumentoRetorno;
    }

}
