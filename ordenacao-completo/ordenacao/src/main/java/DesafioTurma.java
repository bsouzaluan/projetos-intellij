import java.util.Scanner;

public class DesafioTurma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] turma1 = new String[5];
        String[] turma2 = new String[5];

        int qtdT1 = 0;
        int qtdT2 = 0;

        for (int i = 0; i < turma1.length; i++) {
            System.out.println("Digite o nome:");
            String nomeDigitado = leitor.nextLine();

            System.out.println("Digite a turma: ");
            String turmaDigitada = leitor.nextLine();

            if(turmaDigitada.equalsIgnoreCase("T1")){
                turma1[qtdT1] = nomeDigitado;
                qtdT1++;
            }else if(turmaDigitada.equalsIgnoreCase("T2")){
                turma2[qtdT2] = nomeDigitado;
                qtdT2++;
            }
        }

        System.out.println("Exibindo T1");
        exibirVetor(turma1, qtdT1);
        System.out.println("Exibindo T2");
        exibirVetor(turma2, qtdT2);
    }

    public static void exibirVetor(String[] nomes, int qtd){
        for (int i = 0; i < qtd; i++) {
            System.out.println(nomes[i]);
        }
    }
}
