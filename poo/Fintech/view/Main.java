package view;
import model.Usuario;
import model.Despesa;
import model.Investimento;
import model.MetaFinanceira;
import model.Receita;

public class Main  {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Fer",
                "fer@email.com",
                18,
                2500.00,
                "12345678900",
                "1234"
        );

        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("Saldo do usuário: " + usuario.getSaldoUsuario());


        Receita receita = new Receita(
                "Salário",
                "Salário mensal",
                "Trabalho",
                2500.00,
                "01/09/2026",
                "Fixa"
        );

        System.out.println("Receita: " + receita.getReceita());

        receita.setInformcacoes(
                "Freelance",
                "Projeto de desenvolvimento",
                "Trabalho",
                "01/09/2026",
                "Variável"
        );

        System.out.println("Receita atualizada: " + receita.getReceita());


        Despesa despesa = new Despesa(
                "Educação",
                "Mensalidade da faculdade",
                500.00,
                "05/09/2026",
                "Cartão"
        );

        System.out.println("Categoria da despesa: " + despesa.getCategoria());
        System.out.println("Informações da despesa: " + despesa.getDespesa());


        Investimento investimento = new Investimento(
                "Investimento de renda fixa",
                1000.00,
                10.5,
                "Renda Fixa",
                "10/09/2026"
        );

        System.out.println("Descrição do investimento: " + investimento.getDescricao());
        System.out.println("Valor investido: " + investimento.getValorInvestido());

        MetaFinanceira meta = new MetaFinanceira(
                "Reserva de emergência",
                "Construir uma reserva financeira",
                "31/12/2026",
                10000.00,
                3000.00
        );

    }
}