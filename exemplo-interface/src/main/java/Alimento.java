public class Alimento extends Produto  {
    private  int quantVitamina;

    @Override
    public double getValorTributo() {
        return 0.10;
    }

    public Alimento(int quantVitamina) {
        this.quantVitamina = quantVitamina;
    }

    public int getQuantVitamina() {
        return quantVitamina;
    }

    public void setQuantVitamina(int quantVitamina) {
        this.quantVitamina = quantVitamina;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "quantVitamina=" + quantVitamina +
                '}';
    }
}
