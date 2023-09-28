public class Coordenador extends Funcionario implements Calculavel{

    private Double horasTrabalhadas;

    private Double valorHoras;
    private Integer qtdCurso;

    public Coordenador(String nome, Integer cpf, Double horasTrabalhadas, Double valorHoras, Integer qtdCurso) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoras = valorHoras;
        this.qtdCurso = qtdCurso;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
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
        return (((horasTrabalhadas * valorHoras * 4.5) + qtdCurso * 500)*1.20);
    }
}
