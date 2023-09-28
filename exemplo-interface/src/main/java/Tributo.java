import java.util.ArrayList;
import java.util.List;

public class Tributo {


    private List<Tributavel> tributaveis;

    public Tributo() {
        this.tributaveis = new ArrayList<>();
    }




    public List<Tributavel> getTributaveis() {
        return tributaveis;
    }

    public void setTributaveis(List<Tributavel> tributaveis) {
        this.tributaveis = tributaveis;
    }

    public void adicionaTributavel(Tributavel t) {

        tributaveis.add(t);

    }

    public double calculaTotalTributo() {

        double soma = 0.0;
        for (int i = 0; i < tributaveis.size(); i++) {

            soma = tributaveis.get(i).getValorTributo();
        }

        return soma;
    }

    public void exibeTodos() {

        for (Tributavel tributo : tributaveis) {

            System.out.println(tributo);
        }
    }

}
