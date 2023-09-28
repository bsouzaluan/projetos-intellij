package org.example;

public class Horista extends Fuuncionario {

    private Integer qtdHora;
    private Double valorHora;

    public Horista(String nome, String cpf, Integer qtdHora, Double valorHora) {
        super(nome, cpf);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularSalario() {
        return qtdHora * valorHora;
    }

    @Override
    public String toString() {
        return String.format("%S\nQuantidade Horas: %d" + "\nvalor Hora: %.2f",super.toString(),this.qtdHora,this.valorHora);
    }
}
