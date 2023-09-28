public class TesteSaidaFormatada {

    public static void main(String[] args) {

        String nome01 = "Maria";
        String nome02 = "João";

        int ra01 =123;
        int ra02 =234;

        double nota01 = 3.5;
        double nota02 = 10.0;

        System.out.printf("%-7s %-14s %7S  \n" ,"ra","nome","nota");
        System.out.printf("%07d %-14s %7.2f \n",ra01,nome01,nota01);
        System.out.printf("%07d %-14s %7.2f \n",ra02,nome02,nota02);
    }
}
