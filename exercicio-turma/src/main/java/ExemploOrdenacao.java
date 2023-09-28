public class ExemploOrdenacao {
    public static void main(String[] args) {
        int[] v1 = {4,7,5,2,8,1,6,3};
        int[] v2 = {4,7,5,2,8,1,6,3};
        int[] v3 = {4,7,5,2,8,1,6,3};

        selectionsort(v1);

        selectionsortOtimizado(v2);
        bubbleSort(v3);


        System.out.println("selection sort");
       exibirVetor(v3);
    }

    public  static void exibirVetor(int[] v){
        for (int i = 0; i <v.length; i++) {

            System.out.println(v[i]);
        }

    }

    public  static void selectionsort (int[] v){

        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {

                if (v[j] < v[i]){

                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }

        }
    }

    public  static void selectionsortOtimizado (int[] v){

        for (int i = 0; i < v.length - 1; i++) {
            int indMenor = i;
            for (int j = i + 1; j < v.length; j++) {

                if (v[j] < v[indMenor]){

                    indMenor = j;
                }
            }
            int aux = v[i];
            v[i] = v[indMenor];
            v[indMenor] = aux;
        }


    }
    
    public static void bubbleSort(int[] v){
        for (int i = 0; i <v.length ; i++) {
            for (int j = 1; j < v.length - i; j++) {

                if (v[j-1] > v[j]){
                    int aux = v[j];
                    v[j] = v[j-1];
                    v[j - 1] = aux;
                }
            }
        }
    }

    public static int pesqBinaria (int[] v, int x) { // x é o valor procurado
        int indinf, indsup;
        indinf = 0; /* índice inferior */
        indsup = v.length - 1; /* índice superior */
        while (indinf <= indsup) {

            int meio = (indinf + indsup) / 2; /* calcula o índice do meio */

            if (v[meio] == x) {
                return meio; // retorna o índice do elemento encontrado
            } else if (x < v[meio]) {// x < elemento do meio ?
                indsup = meio - 1;
            } else{
                indinf = meio + 1; // não, então indinf passa a ser meio+1
            }
        }
        return -1;
    }
}
