package sptech.modelo;

public class Carro {

    private String modelo;

    private  int anoFabricante;

    private  Fabricante fabricante;

    public Carro() {
    }

    public Carro(String modelo, int anoFabricante, Fabricante fabricante) {
        this.modelo = modelo;
        this.anoFabricante = anoFabricante;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricante() {
        return anoFabricante;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }
}
