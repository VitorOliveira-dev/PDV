package br.instrumentosmusicais.pdv.controller;

import br.instrumentosmusicais.pdv.DAO.PDVDAO;
import br.instrumentosmusicais.pdv.model.Cliente;
import br.instrumentosmusicais.pdv.model.ItensVenda;
import br.instrumentosmusicais.pdv.model.Produto;
import br.instrumentosmusicais.pdv.model.RelatorioSintetico;
import br.instrumentosmusicais.pdv.model.Venda;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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

    public static ArrayList<String[]> vendaBuscarCliente(String pNome, String pCPF) {

        ArrayList<Cliente> listaClientes = PDVDAO.vendaBuscarCliente(pNome, pCPF);
        ArrayList<String[]> retorno = new ArrayList<>();

        for (Cliente obj : listaClientes) {
            retorno.add(new String[]{
                String.valueOf(obj.getCodCliente()),
                String.valueOf(obj.getNomeCliente()),
                String.valueOf(obj.getCPF())});

        }
        return retorno;

    }

    public static ArrayList<String[]> vendaBuscarProduto(String pCodigo, String pInstrumento) {

        ArrayList<Produto> listaProdutos = PDVDAO.vendaBuscarProduto(pCodigo, pInstrumento);
        ArrayList<String[]> retorno = new ArrayList<>();

        for (Produto obj : listaProdutos) {
            retorno.add(new String[]{
                String.valueOf(obj.getCodProduto()),
                String.valueOf(obj.getInstrumento()),
                String.valueOf(obj.getValor())});

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
                String.valueOf(obj.getQuantidade()),
                String.valueOf(obj.getValor())});

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
                String.valueOf(obj.getQuantidade()),
                String.valueOf(obj.getValor())});

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
