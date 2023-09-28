import java.util.Scanner;

public class TesteVetores {


    public static void exibirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("[%d] = %d", i, vetor[i]));
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //criando um vetor de inteiros
        int[] vetor01 = new int[10];

        //criando e inicializando um vetor

        int[] vetor02 = {100,200,300,400,500};

        String[] vetor03 = new String[4];

        //alterando valores do vetor01
        for (int i = 0; i < vetor01.length; i++) {

            vetor01[i] = i * 10;

        }

        //exibindo os valores do vetor
//        for (int i = 0; i < vetor01.length; i++) {
//            System.out.println(String.format("[%d] = %d", i, vetor01[i]));
//        }
//

        exibirVetor(vetor01);
        exibirVetor(vetor02);

        //desafio: prencha o vetor03 com nomes digitados pelo usuario

        System.out.println("Digite um nome");

        for (int i = 0; i <  vetor03.length; i++) {

            vetor03[i] = scanner.nextLine();
        }

        System.out.println("Nomes digitados");
        for (String nome : vetor03){
            System.out.println(nome);

        }
    }
}
