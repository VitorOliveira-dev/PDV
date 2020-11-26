package br.instrumentosmusicais.pdv.model;

import java.util.Date;

public class RelatorioSintetico {
    private Date dataVenda;
    private int codVenda;
    private String nome;
    private float totalVenda;

    public RelatorioSintetico() {
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public String getNome() {
        return nome;
    }

    public float getTotalVenda() {
        return totalVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }
}
