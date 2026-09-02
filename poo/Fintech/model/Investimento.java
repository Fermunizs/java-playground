package model;

public class Investimento {
    private String descricaoInvestimento;
    private double valorInvestido;
    private double rentabilidade;
    private String tipoInvestimento;
    private String dataInvestimento;

    public Investimento(String descricaoInvestimento, double valorInvestido, double rentabilidade, String tipoInvestimento, String dataInvestimento) {
        this.descricaoInvestimento = descricaoInvestimento;
        this.valorInvestido = valorInvestido;
        this.rentabilidade = rentabilidade;
        this.tipoInvestimento = tipoInvestimento;
        this.dataInvestimento = dataInvestimento;
    }

    public String getDescricao() {
        return descricaoInvestimento;
    }

    public void setDescricao(String novaDescricao) {
        this.descricaoInvestimento = novaDescricao;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public double getRentabilidade() {
        return rentabilidade;
    }

    public String getInvestimento() {
        return "Data do investimento" + this.dataInvestimento + "Descrição:" + this.descricaoInvestimento  + "Valor:" + this.valorInvestido + "Rentabilidade:" + this.rentabilidade;
    }
}