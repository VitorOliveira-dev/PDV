package br.instrumentosmusicais.pdv.controller;
import br.instrumentosmusicais.pdv.DAO.ManutencaoDAO;
import br.instrumentosmusicais.pdv.model.Cliente;
import br.instrumentosmusicais.pdv.model.Produto;
import java.util.ArrayList;

public class ManutencaoController {

    public static ArrayList<String[]> manutencaoPesquisarTodosClientes() {
        ArrayList<Cliente> listaClientes = ManutencaoDAO.manutencaoPesquisarTodosClientes();
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

    public static ArrayList<String[]> manutencaoPesquisarCliente(String pCPF,String pNome) {
        ArrayList<Cliente> listaClientes = ManutencaoDAO.manutencaoPesquisarCliente(pCPF,pNome);
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
        ArrayList<Produto> listaProdutos = ManutencaoDAO.manutencaoPesquisarTodosProdutos();
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

    public static ArrayList<String[]> manutencaoPesquisarProduto(String pCodigo, String pInstrumento) {
        ArrayList<Produto> listaProdutos = ManutencaoDAO.manutencaoPesquisarProduto(pCodigo, pInstrumento);
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
        return ManutencaoDAO.manutencaoExcluirCliente(pCodCliente);
    }

    public static boolean manutencaoExcluirProduto(int pCodProduto) {
        return ManutencaoDAO.manutencaoExcluirProduto(pCodProduto);
    }

}
