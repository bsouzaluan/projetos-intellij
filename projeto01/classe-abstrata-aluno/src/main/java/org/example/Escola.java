package org.example;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private List<Aluno> alunos;

    public Escola() {
        this.alunos = new ArrayList<>();
    }


    public void adicionarAluno(Aluno a) {

        alunos.add(a);
    }

    public void exibeTodos() {

        for (Aluno alunoDaVez : alunos) {

            System.out.println("---------");
            System.out.println(alunoDaVez);
        }
    }

    public void exibeAlunosGraduacao() {

        for (Aluno alunoDaVez : alunos) {
            if (alunoDaVez instanceof AlunoGraduacao) {
                System.out.println("---------");
                System.out.println(alunoDaVez);
            }
        }
    }

    public void exibeAprovados() {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).calcularMedia() >= 6) {
                System.out.println(alunos.get(i));
            }
        }
    }


    public void buscaAluno(Integer ra) {

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equals(ra)) {

                System.out.println(alunos.get(i));
            } else {
                System.out.println("Aluno não encontrado");
            }
        }

    }

}
