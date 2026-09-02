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

        System.out.print("Construtor Despesa executado.");
    }

    public String getCategoria() {
        return categoriaDespesa;
    }

    public void setCategoria(String categoria) {
        this.categoriaDespesa = categoria;
        System.out.print("Método setCategoria() executado.");
    }

    public void setDescricao(String novaDescricao) {
        this.descricaoDespesa = novaDescricao;
        System.out.print("Método setDescricao() executado.");
    }

    public String getDespesa() {
        return categoriaDespesa + descricaoDespesa + dataDespesa + formaPagamento;
    }
}