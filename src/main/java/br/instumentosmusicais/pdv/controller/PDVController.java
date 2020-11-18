package br.instumentosmusicais.pdv.controller;

import br.instumentosmusicais.pdv.DAO.PDVDAO;
import br.instumentosmusicais.pdv.model.Cliente;
import br.instumentosmusicais.pdv.model.ItensVenda;
import br.instumentosmusicais.pdv.model.Produto;
import br.instumentosmusicais.pdv.model.Venda;
import java.util.ArrayList;

public class PDVController {

    public static boolean vendaVender(float total, int codCliente, ArrayList<String[]> pItensVenda) {
        Venda vender = new Venda();
        vender.setTotalVenda(total);
        vender.setCodCliente(codCliente);

        ArrayList<ItensVenda> listaItensVenda = new ArrayList<ItensVenda>();
        // teste String[] itens = pItensVenda.get(0);

        for (String[] item : pItensVenda) {
            ItensVenda adicionar = new ItensVenda();
            adicionar.setCodProduto(Integer.parseInt(item[0]));
            adicionar.setCodCliente(codCliente);
            adicionar.setQtd_vendida(Integer.parseInt(item[3]));
            adicionar.setValorUnitario(Float.parseFloat(item[2]));

            listaItensVenda.add(adicionar);
        }

        vender.setListaItens(listaItensVenda);

        return PDVDAO.vendaVender(vender);
    }

    public static String[] vendaBuscarCliente(String nome, String CPF) {
        Cliente obj = PDVDAO.vendaBuscarCliente(nome, CPF);
        String[] retorno = null;

        if (obj != null) {
            retorno = new String[]{
                String.valueOf(obj.getCodCliente()),
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

    public static ArrayList<String[]> manutencaoPesquisarCliente(String pNome) {
        ArrayList<Cliente> listaClientes = PDVDAO.manutencaoPesquisarCliente(pNome);
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

    public static ArrayList<String[]> manutencaoPesquisarProduto(String pInstrumento) {
        ArrayList<Produto> listaProdutos = PDVDAO.manutencaoPesquisarProduto(pInstrumento);
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

    public static boolean manutencaoExcluirCliente(int pCodCliente) {
        return PDVDAO.manutencaoExcluirCliente(pCodCliente);
    }

    public static boolean manutencaoExcluirProduto(int pCodProduto) {
        return PDVDAO.manutencaoExcluirProduto(pCodProduto);
    }

    public static boolean salvarProduto(String instrumento, String cor, String tipo, String fabricante, int quantidade, float valor) {

        boolean retorno = false;

        Produto objProduto = new Produto();
        objProduto.setInstrumento(instrumento);
        objProduto.setCor(cor);
        objProduto.setTipo(tipo);
        objProduto.setFabricante(fabricante);
        objProduto.setQuantidade(quantidade);
        objProduto.setValor(valor);
        return PDVDAO.salvarProduto(objProduto);

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
        return PDVDAO.atualizarProduto(objProduto);

    }
    
    public static String[] consultarPorID(int idProduto) {
    
        Produto objInstrumento = PDVDAO.consultarPorID(idProduto);
        
        String[] instrumentoRetorno  = null;
        
        if(objInstrumento!=null){
            instrumentoRetorno = new String[]{ String.valueOf(objInstrumento.getCodProduto())
                                                ,String.valueOf(objInstrumento.getInstrumento())
                                                ,String.valueOf(objInstrumento.getCor()) 
                                                ,String.valueOf(objInstrumento.getTipo())
                                                ,String.valueOf(objInstrumento.getFabricante())
                                                ,String.valueOf(objInstrumento.getQuantidade())
                                                ,String.valueOf(objInstrumento.getValor())
            };
            
        }
        
        return instrumentoRetorno;
    }

}
