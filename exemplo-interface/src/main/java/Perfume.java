public class Perfume extends  Produto{

    private String fragrancia;


    public Perfume(String fragrancia) {
        this.fragrancia = fragrancia;
    }

    public String getFragrancia() {
        return fragrancia;
    }

    public void setFragrancia(String fragrancia) {
        this.fragrancia = fragrancia;
    }

    @Override
    public double getValorTributo() {
        return 0.20;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "fragrancia='" + fragrancia + '\'' +
                '}';
    }
}
