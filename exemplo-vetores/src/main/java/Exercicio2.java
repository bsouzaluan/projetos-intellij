import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 numeros");
        int soma = 0;
        for (int i = 0; i < vetor1.length; i++) {

            vetor1[i] = scanner.nextInt();
            soma +=vetor1[i];

        }
        int resultado = soma /10;

        System.out.println(resultado);

        for (int i = 0; i < vetor1.length ; i++) {

            if (vetor1[i] > resultado){
                System.out.println(vetor1[i]);
            }
        }

    }

}
