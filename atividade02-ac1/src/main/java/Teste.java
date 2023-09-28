import org.w3c.dom.ls.LSOutput;

public class Teste {
    public static void main(String[] args) {
        Instituicao instituicao = new Instituicao();
        Aluno aluno = new Aluno("Luan","08786655646");
        Coordenador coordenador = new Coordenador("Lenon",525252521,8.00,30.00,2);
        Professor professor = new Professor("Estiven",1234579883,8,25.00);


        instituicao.adicionarAluno(aluno);
        instituicao.adicionar(coordenador);
        instituicao.adicionar(professor);






    }
}
