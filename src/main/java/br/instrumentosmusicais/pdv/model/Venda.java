package br.instrumentosmusicais.pdv.model;
import java.util.Date;
import java.util.ArrayList;

public class Venda {
    
    private int codVenda;
    private Date dataVenda;
    private float totalVenda;
    private int codCliente; //FK
    
    ArrayList<ItensVenda> listaItens;

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    
    public Venda(){
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }
    
    public float getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }

    public ArrayList<ItensVenda> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItensVenda> listaItens) {
        this.listaItens = listaItens;
    }
}
