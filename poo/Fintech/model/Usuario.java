package model;

public class Usuario{
    private String nome;
    private String email;
    private Integer idade;
    private Double salario;
    private String cpf;
    private String senha;

    public void Usuario(String nome, String email, Integer idade, Double salario, String cpf, String senha){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.salario = salario;
        this.cpf = cpf;
        this.senha = senha;
    }

}