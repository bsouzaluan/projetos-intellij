package org.example;

public class Engenheiro extends  Fuuncionario{

    private Double salario;

    public Engenheiro(String nome, String cpf, Double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    @Override
    public Double calcularSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return String.format("%s\n" + "Salário: %.2f",super.toString(),this.salario);
    }
}
