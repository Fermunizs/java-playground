package model;

public class Usuario{
    private String nome;
    private String email;
    private Integer idade;
    private Double saldo;
    private String cpf;
    private String senha;

    public void Usuario(String nome, String email, Integer idade, Double saldo, String cpf, String senha){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.saldo = saldo;
        this.cpf = cpf;
        this.senha = senha;
    }

    //GETTERS E SETTERS

    public String getSaldo(){
        return saldo.toString();
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(String novoEmail){
        this.email = novoEmail;
        return email;
    }

}