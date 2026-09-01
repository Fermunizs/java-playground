package model;

public class MetaFinanceira  {
    private String nomeMetaFinanceira;
    private String descricaoMetaFinanceira;
    private String dataMetaFinanceira;
    private double valorObjetivo;
    private double valorAtualObjetivo;

    public MetaFinanceira(String nomeMetaFinanceira, String descricaoMetaFinanceira, String dataMetaFinanceira, double valorObjetivo, double valorAtualObjetivo) {
        this.nomeMetaFinanceira = nomeMetaFinanceira;
        this.descricaoMetaFinanceira = descricaoMetaFinanceira;
        this.dataMetaFinanceira = dataMetaFinanceira;
        this.valorObjetivo = valorObjetivo;
        this.valorAtualObjetivo = valorAtualObjetivo;
    }

    public String getNomeMetaFinanceira() {
        return nomeMetaFinanceira;
    }

    public void setNomeMetaFinanceira(String nomeMetaFinanceira) {
        this.nomeMetaFinanceira = nomeMetaFinanceira;
    }

    public double getValorAtualObjetivo() {
        return valorAtualObjetivo;
    }
}