import java.util.ArrayList;
import java.util.List;

public class ControleBonus {


    private List<Calculavel> calculaveis;


    public void Calculavel() {
        this.calculaveis = new ArrayList<>();
    }


    public void adicionarVendavel(Calculavel c){
        calculaveis.add(c);

    }

    public Double calcularTotalVenda(){

        double soma = 0.0;
        for (int i = 0; i < calculaveis.size(); i++) {

            soma = calculaveis.get(i).calculaSalario();
        }

        return soma;


    }



    public void exibeItensCarrinho(){

        for (Calculavel calculo : calculaveis){

            System.out.println(calculo);
        }
    }


    public getValorBonus(){

    }
}
