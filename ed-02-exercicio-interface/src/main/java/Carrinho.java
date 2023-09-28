import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel>vendaveis;


    public Carrinho() {
        this.vendaveis = new ArrayList<>();
    }


    public void adicionarVendavel(Vendavel v){
        vendaveis.add(v);

    }

    public Double calcularTotalVenda(){

        double soma = 0.0;
        for (int i = 0; i < vendaveis.size(); i++) {

            soma = vendaveis.get(i).getValorVenda();
        }

        return soma;


    }



    public void exibeItensCarrinho(){

        for (Vendavel vendas : vendaveis) {

            System.out.println(vendas);
        }
    }



}
