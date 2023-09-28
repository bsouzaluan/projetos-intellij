public class Exercicio1 {
    public static void main(String[] args) {

        int[] vetor1 = new int[7];

        for (int i = 0; i < vetor1.length; i++) {

            System.out.println(String.format("%d",i+1 ));
        }

        for (int i = vetor1.length-1; i >=0; i--) {

            System.out.println(String.format("%d",i+1 ));
        }
    }

}
