package biblioteca;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> listaDeLivros;
    private ArrayList<Usuario> listaDeUsuarios;

    public Biblioteca() {
        this.listaDeLivros = new ArrayList<>();
        this.listaDeUsuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro novoLivro){
        this.listaDeLivros.add(novoLivro);
        System.out.println("Livro adicionado com sucesso!");
    }

}