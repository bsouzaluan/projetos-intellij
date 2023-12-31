package org.example;

public abstract class Fuuncionario {

    private String nome;
    private String cpf;

    public Fuuncionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract Double calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("Nome %s\n"+"CPF: %s",this.nome,this.cpf);
    }
}
