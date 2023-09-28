public class ListaEstatica {

    int[] vetor;
    int numeroElementos;

    public ListaEstatica( int tamanho,int numeroElementos) {
        vetor = new int[tamanho];
        numeroElementos = 0;

    }

    public void  adiciona(int valorLista){
            for (int i = 0; i < numeroElementos; i++) {
                if (i >= numeroElementos) {
                    if (vetor[i] == 0) {
                        vetor[i] = valorLista;
                        numeroElementos ++;
                        System.out.println(numeroElementos);

                        if (numeroElementos == vetor.length) {
                            System.out.println("Vetor cheio");
                        }
                    }
            }
        }
    }

    public void exibe(){

        for (int i = 0; i < numeroElementos; i++) {

            System.out.println(vetor[i]);
        }
    }

    public int busca(){

            int indinf, indsup;
            indinf = 0; /* índice inferior */
            indsup = vetor.length - 1; /* índice superior */
            while (indinf <= indsup) {

                int meio = (indinf + indsup) / 2; /* calcula o índice do meio */

                if (vetor[meio] == numeroElementos) {
                    return meio; // retorna o índice do elemento encontrado
                } else if (numeroElementos < vetor[meio]) {// x < elemento do meio ?
                    indsup = meio - 1;
                } else{
                    indinf = meio + 1; // não, então indinf passa a ser meio+1
                }
            }
            return -1;

    }

    public boolean removePeloIndice(){

        return true;
    }
}
