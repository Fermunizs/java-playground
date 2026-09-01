package model;

public class Usuario{
    private String nomeUsuario;
    private String emailUsuario;
    private Integer idadeUsuario;
    private Double saldoUsuario;
    private String cpf;
    private String senhaUsuario;

    public void Usuario(String nomeUsuario, String emailUsuario, Integer idadeUsuario, Double saldoUsuario, String cpf, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.idadeUsuario = idadeUsuario;
        this.saldoUsuario = saldoUsuario;
        this.cpf = cpf;
        this.senhaUsuario = senhaUsuario;

        System.out.print("O construtor está sendo executado.");
    }

    //GETTERS E SETTERS

    public String getSaldoUsuario(){
        return saldoUsuario.toString();
    }
    public String getNome(){
        return nomeUsuario;
    }
    public String getEmail(String novoEmail){
        this.emailUsuario = novoEmail;
        return emailUsuario;
    }

}