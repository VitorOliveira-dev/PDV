package br.instrumentosmusicais.pdv.model;

public class RelatorioSintetico {
    private String dataVenda;
    private int codVenda;
    private String nome;
    private float totalVenda;

    public RelatorioSintetico() {
    }

    public String getDataVenda() {
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

    public void setDataVenda(String dataVenda) {
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
