package org.example;

public class Teste {

    public static void main(String[] args) {

        Escola escola = new Escola();

        AlunoFundamental alunoFundamental = new AlunoFundamental(87654321,"Lucas",5.5, 7.0,5.0,6.0);
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao(12345678,"Luan",6.0,5.5);
        AlunoPos alunoPos = new AlunoPos(98765432,"Lenon",7.0,3.0,8.0);


        escola.adicionarAluno(alunoFundamental);
        escola.adicionarAluno(alunoGraduacao);
        escola.adicionarAluno(alunoPos);

        escola.exibeTodos();

        escola.buscaAluno(98765432);
        escola.exibeAprovados();
        escola.exibeAlunosGraduacao();
    }
}
