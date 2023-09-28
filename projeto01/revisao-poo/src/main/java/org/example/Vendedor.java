package org.example;

public class Vendedor  extends  Fuuncionario{

    private  Double vendas;
    private Double taxa;

    public Vendedor(String nome, String cpf, Double vendas, Double taxa) {
        super(nome, cpf);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public Double calcularSalario() {
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return String.format("%s\nVendas: %.2f"+"\nTaxa %.2f" ,super.toString(),this.vendas,this.taxa);
    }
}
