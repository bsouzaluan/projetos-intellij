import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    private List<Ibonavel> bonaveis;


    public ControleBonus() {
        this.bonaveis = new ArrayList<>();
    }


    public void adicionarBonus(Ibonavel b){
        bonaveis.add(b);

    }

    public Double calcularTotalBonus(){

        double soma = 0.0;
        for (int i = 0; i < bonaveis.size(); i++) {

            soma = bonaveis.get(i).getValorBonus();
        }

        return soma;


    }



    public void exibeItens(){

        for (Ibonavel bonus : bonaveis) {

            System.out.println(bonus);
        }
    }
}
