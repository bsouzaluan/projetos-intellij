public class Funcionario {

    private  Integer cpf;
    private String nome;

    public Funcionario(Integer cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                '}';
    }
}
