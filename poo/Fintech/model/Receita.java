package model;

public class Receita{
    private String nomeReceita;
    private String descricaoReceita;
    private String categoriaReceita;
    private double valorReceita;
    private String dataReceita;
    private String tipoReceita;

    public Receita(String nomeReceita, String descricaoReceita, String categoriaReceita, Double valorReceita, String dataReceita, String tipoReceita) {
        this.nomeReceita = nomeReceita;
        this.descricaoReceita = descricaoReceita;
        this.categoriaReceita = categoriaReceita;
        this.valorReceita = valorReceita;
        this.dataReceita = dataReceita;
        this.tipoReceita = tipoReceita;

        System.out.print("Construtor Receita executado.");
    }

    public String getReceita() {
        return nomeReceita + descricaoReceita + categoriaReceita + dataReceita + tipoReceita + valorReceita;
    }

    public String setInformcacoes(String novoNome, String novaDescricao, String novaCategoria, String novaData, String novoTipo){
        this.nomeReceita = novoNome;
        this.descricaoReceita = novaDescricao;
        this.categoriaReceita = novaCategoria;
        this.dataReceita = novaData;
        this.tipoReceita = novoTipo;

        System.out.print("Método setInformacoes() executado.");

        return this.getReceita();
    }
}