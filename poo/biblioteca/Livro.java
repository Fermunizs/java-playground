package biblioteca;

public class Livro {
    private String nomeLivro;
    private String nomeAutor;
    private int anoLivro;
    private String generoLivro;
    private Boolean livroDisponivel;

    public static void main(String[] args){
        System.out.print("Livro aberto");
    }

    public Livro(String nomeLivro, String nomeAutor, String generoLivro, int anoLivro) {
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.generoLivro = generoLivro;
        this.anoLivro = anoLivro;
        this.livroDisponivel = true;
    }

}