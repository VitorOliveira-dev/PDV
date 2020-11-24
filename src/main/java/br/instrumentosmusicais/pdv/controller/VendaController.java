package br.instrumentosmusicais.pdv.controller;

import br.instrumentosmusicais.pdv.DAO.VendaDAO;
import br.instrumentosmusicais.pdv.model.Cliente;
import br.instrumentosmusicais.pdv.model.ItensVenda;
import br.instrumentosmusicais.pdv.model.Produto;
import br.instrumentosmusicais.pdv.model.Venda;
import java.util.ArrayList;

public class VendaController {

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

        return VendaDAO.vendaVender(vender);
    }

    public static ArrayList<String[]> vendaBuscarCliente(String pNome, String pCPF) {

        ArrayList<Cliente> listaClientes = VendaDAO.vendaBuscarCliente(pNome, pCPF);
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

        ArrayList<Produto> listaProdutos = VendaDAO.vendaBuscarProduto(pCodigo, pInstrumento);
        ArrayList<String[]> retorno = new ArrayList<>();

        for (Produto obj : listaProdutos) {
            retorno.add(new String[]{
                String.valueOf(obj.getCodProduto()),
                String.valueOf(obj.getInstrumento()),
                String.valueOf(obj.getValor())});

        }
        return retorno;

    }

}
