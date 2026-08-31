package model;

public class Despesa {
    private String categoria;
    private String descricao;
    private double valor;
    private String data;
    private String formaPagamento;

    public class Despesa(String descricao, double valor) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.formaPagamento = formaPagamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    public String getDespesa() {
        return categoria + descricao + data + formaPagamento;
    }
}