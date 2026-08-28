package biblioteca;

public class Main  {
    public static void main(String[] args) {

        Biblioteca bibliotecaDaFer = new Biblioteca();

        Livro venda = new Livro("Venda!", "Dale Carnegie", "Desenvolvimento", 2020);

        Livro orgulhoPreconceito = new Livro("Orgulho e Preconceito", "Jande Austen", "Romance", 1806);

        Livro comoFazerAmigosInfluenciarPessoas = new Livro("Como fazer amigos e influenciar pessoas", "Dale Carnegie", "Desenvolvimento", 1897);

        bibliotecaDaFer.adicionarLivro(venda);
        bibliotecaDaFer.adicionarLivro(orgulhoPreconceito);
        bibliotecaDaFer.adicionarLivro(comoFazerAmigosInfluenciarPessoas);

        


    }
}