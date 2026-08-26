package biblioteca;

public class Livro {
    private String nomeLivro;
    private String nomeAutor;
    private int anoLivro;
    private String generoLivro;
    private Boolean livroDisponivel;

    public livro(String nomeAutor, String generoLivro, int anoLivro, String nomeLivro) {
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.generoLivro = generoLivro;
        this.anoLivro = anoLivro;
        this.livroDisponivel = true;
    }

}