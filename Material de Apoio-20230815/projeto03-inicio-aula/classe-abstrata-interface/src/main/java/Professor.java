public class Professor extends  Funcionario implements Calculavel{


    private Integer qtdAulaPorSemana;
    private Double valorHora;

    public Professor(Integer cpf, String nome, Integer qtdAulaPorSemana, Double valorHora) {
        super(cpf, nome);
        this.qtdAulaPorSemana = qtdAulaPorSemana;
        this.valorHora = valorHora;
    }

    public Integer getQtdAulaPorSemana() {
        return qtdAulaPorSemana;
    }

    public void setQtdAulaPorSemana(Integer qtdAulaPorSemana) {
        this.qtdAulaPorSemana = qtdAulaPorSemana;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calculaSalario() {
        return ((qtdAulaPorSemana * valorHora * 4.5) * 1.15);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "qtdAulaPorSemana=" + qtdAulaPorSemana +
                ", valorHora=" + valorHora +
                '}';
    }
}
