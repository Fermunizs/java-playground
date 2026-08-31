package model;

public class Receita{
    private String nome;
    private String descricao;
    private String categoria;
    private double valor;
    private String data;
    private String tipo;

    public void Receita(String nome, String descricao, String categoria, Double valor, String data, String tipo){
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
    }

    public String getReceita() {
        return nome + descricao + categoria + data + tipo + valor;
    }

    public String setInformcacoes(String novoNome, String novaDescricao, String novaCategoria, String novaData, String novoTipo){
        this.nome = novoNome;
        this.descricao = novaDescricao;
        this.categoria = novaCategoria;
        this.data = novaData;
        this.tipo = novoTipo;
    }
}