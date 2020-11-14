package br.instumentosmusicais.pdv.controller;

import br.instumentosmusicais.pdv.DAO.PDVDAO;
import br.instumentosmusicais.pdv.model.Cliente;
import br.instumentosmusicais.pdv.model.Produto;
import java.util.ArrayList;

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

    public static ArrayList<String[]> manutencaoPesquisarTodosClientes() {
        ArrayList<Cliente> listaClientes = PDVDAO.manutencaoPesquisarTodosClientes();
        ArrayList<String[]> retorno = new ArrayList<>();

        for (Cliente obj : listaClientes) {
            retorno.add(new String[]{
                String.valueOf(obj.getCodCliente()),
                String.valueOf(obj.getNomeCliente()),
                String.valueOf(obj.getCPF()),
                String.valueOf(obj.getTelefone())});

        }
        return retorno;

    }

    public static String[] manutencaoPesquisarCliente(String pNome) {

        Cliente obj = PDVDAO.manutencaoPesquisarCliente(pNome);
        String[] retorno = null;

        if (obj != null) {
            retorno = new String[]{String.valueOf(obj.getCodCliente()),
                String.valueOf(obj.getNomeCliente()),
                String.valueOf(obj.getCPF()),
                String.valueOf(obj.getTelefone())};
        }
        return retorno;
    }

    public static ArrayList<String[]> manutencaoPesquisarTodosProdutos() {
        ArrayList<Produto> listaProdutos = PDVDAO.manutencaoPesquisarTodosProdutos();
        ArrayList<String[]> retorno = new ArrayList<>();

        for (Produto obj : listaProdutos) {
            retorno.add(new String[]{
                String.valueOf(obj.getCodProduto()),
                String.valueOf(obj.getInstrumento()),
                String.valueOf(obj.getCor()),
                String.valueOf(obj.getTipo()),
                String.valueOf(obj.getFabricante()),
                String.valueOf(obj.getQuantidade())});

        }
        return retorno;

    }

    public static String[] manutencaoPesquisarProduto(String pInstrumento) {

        Produto obj = PDVDAO.manutencaoPesquisarProduto(pInstrumento);
        String[] retorno = null;

        if (obj != null) {
            retorno = new String[]{
                String.valueOf(obj.getCodProduto()),
                String.valueOf(obj.getInstrumento()),
                String.valueOf(obj.getCor()),
                String.valueOf(obj.getTipo()),
                String.valueOf(obj.getFabricante()),
                String.valueOf(obj.getQuantidade())};
        }
        return retorno;
    }

    public static boolean excluirCliente(int pCodCliente) {
        return PDVDAO.excluirCliente(pCodCliente);
    }
    
    public static boolean excluirProduto(int pCodProduto) {
        return PDVDAO.excluirProduto(pCodProduto);
    }

}
