import java.util.Scanner;

public class Turma {

    public static void main(String[] args) {

        String[] turma1 = new String[10];
        String[] turma2 = new String[10];
        Scanner scanner = new Scanner(System.in);


        int qtdT1 = 0;
        int qtdT2 = 0;

        for (int i = 0; i < turma1.length; i++) {
            System.out.println("Digite o nome de um aluno");
            String nomeAluno = scanner.nextLine();


            System.out.println("Digite para qual turma vai");
            String turmaDigitada = scanner.nextLine();
            if (nomeAluno.equals("t1")) {
                turma1[i] = nomeAluno;
                qtdT1++;
            } else if (turmaDigitada.equals("t2")) {
                turma2[i] = nomeAluno;
                qtdT2++;
            }

        }

        System.out.println("Exibindo t1");
        for (int i = 0; i < qtdT1; i++) {

            System.out.println(turma1[i]);
        }
        System.out.println("Exibindo t2");
        for (int i = 0; i < qtdT2; i++) {

            System.out.println(turma2[i]);
        }

//        public static void exibirVetor (String[] nome,int qtd){
//            for (int i = 0; i < qtd; i++) {
//
//                System.out.println(no);
//            }
//        }

    }
}
