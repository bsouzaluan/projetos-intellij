import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vetor1 = new String[3];

        System.out.println("Digite 3 nomes");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = scanner.nextLine();


        }

        System.out.println("Digite um nome para pesquisa");
        String nomeDigitado = scanner.nextLine();
        Boolean achei = false;
        for (int i = 0; i < vetor1.length; i++) {

            if (vetor1[i].equals(nomeDigitado)){
                achei = true;
                System.out.println(String.format("nome encontrado no indice %d" ,i));
            }

        }

                achei = false;
                if (achei = false){
                System.out.println("nome não encontrado");
                }



    }
}
