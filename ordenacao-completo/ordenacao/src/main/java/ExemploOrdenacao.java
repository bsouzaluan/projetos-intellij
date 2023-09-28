public class ExemploOrdenacao {
    public static void main(String[] args) {

        int[] v1 = {4, 7, 5, 2, 8, 1, 6, 3};
        int[] v2 = {4, 7, 5, 2, 8, 1, 6, 3};
        int[] v3 = {4, 7, 5, 2, 8, 1, 6, 3};

        selectionSort(v1);
        selectionSortOtimizado(v2);
        bubbleSort(v3);

        System.out.println("Selection Sort");
        exibirVetor(v1);
        System.out.println("Selection Sort Otimizado");
        exibirVetor(v2);
        System.out.println("Bubble Sort");
        exibirVetor(v3);
    }

    public static void exibirVetor(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
    public static void selectionSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[i]) {
                    //Troca
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
    }

    public static void selectionSortOtimizado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int indMenor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[indMenor]) {
                    indMenor = j;
                }
            }
            int aux = v[i];
            v[i] = v[indMenor];
            v[indMenor] = aux;
        }

    }

    public static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 1; j < v.length - i; j++) {
                if (v[j - 1] > v[j]) {
                    int aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
    }
}
