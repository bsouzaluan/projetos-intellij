import java.time.LocalDate;
import java.util.Scanner;

public class TestaCarrinho {



    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        Integer menu = 0;


        while(menu !=6) {
            System.out.println("Escolha um número entre 1 a 6 \n" +
                    "1-Adicionar livro \n" +
                    "2-Adicionar DVD \n" +
                    "3-Adicionar serviço \n" +
                    "4-Exibir itens do carrinho \n" +
                    "5-Exibir total de vendas \n" +
                    "6-sair");

            menu = scanner.nextInt();


            switch (menu) {

                case 1:

                    System.out.println("Código do livro");
                    Integer codigoLivro = scanner1.nextInt();

                    System.out.println("preço custo");
                    Double precoCusto = scanner1.nextDouble();

                    System.out.println("Digite o nome do livro");
                    String nomeLivro = scanner1.nextLine();

                    System.out.println("Digite o nome do autor");
                    String nomeAutor = scanner1.nextLine();

                    System.out.println("Digite o isbn do livro");
                    String isbn = scanner1.nextLine();


                    Livro livro = new Livro(codigoLivro,precoCusto,nomeLivro,nomeAutor,isbn);
                  carrinho.adicionarVendavel(livro);

                    break;
                case 2:

                    System.out.println("Código do livro");
                    Integer codigoL = scanner1.nextInt();

                    System.out.println("preço custo");
                    Double precoCusto1 = scanner1.nextDouble();

                    System.out.println("Digite o nome do DVD");
                    String nomeDvd = scanner1.nextLine();

                    System.out.println("Digite o nome da gravadora");
                    String nomeGravadora = scanner1.nextLine();

                    Dvd dvd = new Dvd(codigoL,precoCusto1,nomeDvd,nomeGravadora);
                    carrinho.adicionarVendavel(dvd);

                    break;

                case 3:
                    System.out.println("Descrição do serviço");
                    String descricao = scanner1.nextLine();

                    System.out.println("Codigo do serviço");
                    Integer codigo = scanner1.nextInt();

                    System.out.println("Quantidade de horas do serviço");
                    Integer quantidadeHoras = scanner1.nextInt();

                    System.out.println("Valor da hora do serviço");
                    Double valorServico = scanner1.nextDouble();

                    Servico servico = new Servico(descricao,codigo,quantidadeHoras,valorServico);
                    carrinho.adicionarVendavel(servico );
                    break;
                case 4:

                    System.out.println("Exibir itens do carrinho");
                    carrinho.exibeItensCarrinho();

                    break;

                case 5:
                    System.out.println("Exibir total de Vendas");
                    carrinho.calcularTotalVenda();
                    break;

                default:


            }
        }
    }
}
