public class Cordenador extends Funcionario implements  Calculavel{


    private Double qtdHoras;
    private Double valorHoras;
    private Integer qtdCurso;

    public Cordenador(Integer cpf, String nome, Double qtdHoras, Double valorHoras, Integer qtdCurso) {
        super(cpf, nome);
        this.qtdHoras = qtdHoras;
        this.valorHoras = valorHoras;
        this.qtdCurso = qtdCurso;
    }

    public Double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Double qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(Double valorHoras) {
        this.valorHoras = valorHoras;
    }

    public Integer getQtdCurso() {
        return qtdCurso;
    }

    public void setQtdCurso(Integer qtdCurso) {
        this.qtdCurso = qtdCurso;
    }

    @Override
    public double calculaSalario() {
        return (((qtdHoras * valorHoras * 4.5) + qtdCurso * 500)*1.20);
    }
}
