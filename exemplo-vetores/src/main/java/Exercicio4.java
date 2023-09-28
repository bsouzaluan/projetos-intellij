import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[3];
        System.out.println("Digite 10 valores");
        for (int i = 0; i < vetor1.length; i++) {

            vetor1[i] = scanner.nextInt();

        }

        System.out.println("Digite o numero para pesquisa");
        int numeroPesquisa = scanner.nextInt();
        for (int i = 0; i < vetor1.length; i++) {

//            if (numeroPesquisa )
            System.out.println(String.format("o numero %d  ocorre %d",numeroPesquisa,vetor1[i]));

        }


    }
}
