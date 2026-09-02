package model;

public class Despesa {
    private String categoriaDespesa;
    private String descricaoDespesa;
    private double valorDespesa;
    private String dataDespesa;
    private String formaPagamento;

    public Despesa(String categoriaDespesa, String descricaoDespesa, double valorDespesa, String dataDespesa, String formaPagamento ) {
        this.categoriaDespesa = categoriaDespesa;
        this.descricaoDespesa = descricaoDespesa;
        this.valorDespesa = valorDespesa;
        this.dataDespesa = dataDespesa;
        this.formaPagamento = formaPagamento;
    }

    public String getCategoria() {
        return categoriaDespesa;
    }

    public void setCategoria(String categoria) {
        this.categoriaDespesa = categoria;
    }

    public void setDescricao(String novaDescricao) {
        this.descricaoDespesa = novaDescricao;
    }

    public String getDespesa() {
        return categoriaDespesa + descricaoDespesa + dataDespesa + formaPagamento;
    }
}