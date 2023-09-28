import java.util.ArrayList;
import java.util.List;

public class Instituicao {

    private List<Calculavel> calculaveis;
    private List<Aluno> alunos;



    public void adicionar(Calculavel c){
        calculaveis.add(c);

    }

    public void adicionarAluno(Aluno a){
        alunos.add(a);

    }

    public Double calcularTotal(){

        double soma = 0.0;
        for (int i = 0; i < calculaveis.size(); i++) {

            soma = calculaveis.get(i).calculaSalario();
        }

        return soma;


    }



    public void exibeCalculos(){

        for (Calculavel calculo : calculaveis){

            System.out.println(calculo);
        }
    }


}
