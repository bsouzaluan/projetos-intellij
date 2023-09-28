package org.example;

public class TesteEmpresa {

    public static void main(String[] args) {

        Horista funcHorista = new Horista("Horista da silva", "124", 44,150.5);


        Vendedor funcVendedor = new Vendedor("Vendedor de Souza","456",3500.75,0.25);

        Engenheiro funcEngenheiro = new Engenheiro("Engenheiro da silva","678",20000.30);

        Empresa empresa = new Empresa();
        empresa.adicionaFunc(funcEngenheiro);
        empresa.adicionaFunc(funcHorista);
        empresa.adicionaFunc(funcVendedor);

        empresa.exibirTodos();
    }
}
