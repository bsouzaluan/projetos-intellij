package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Fuuncionario>funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionaFunc(Fuuncionario f){

        funcionarios.add(f);
    }

    public void exibirTodos(){
        for (Fuuncionario funcionarioDaVez : funcionarios){

            System.out.println("---------");
            System.out.println(funcionarioDaVez);
        }
    }


    public void exibirHoristas(){
        for (Fuuncionario funcionarioDaVez : funcionarios){
            if(funcionarioDaVez instanceof Horista){
                System.out.println("---------");
                System.out.println(funcionarioDaVez);
            }

        }
    }

    public void exibirTotalSalarios(){
        Double valorTotal = 0.0;

        for (int i = 0; i < funcionarios.size(); i++){
            valorTotal += funcionarios.get(i).calcularSalario();

        }

        System.out.println("o total é:" + valorTotal);
    }


}
