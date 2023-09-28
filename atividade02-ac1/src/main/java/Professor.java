public class Professor extends Funcionario implements Calculavel{

    private Integer qtdAulasPorSemana;

    private Double valorHoras;


    public Professor(String nome, Integer cpf, Integer qtdAulasPorSemana, Double valorHoras) {
        super(nome, cpf);
        this.qtdAulasPorSemana = qtdAulasPorSemana;
        this.valorHoras = valorHoras;
    }

    public Integer getQtdAulasPorSemana() {
        return qtdAulasPorSemana;
    }

    public void setQtdAulasPorSemana(Integer qtdAulasPorSemana) {
        this.qtdAulasPorSemana = qtdAulasPorSemana;
    }

    public Double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(Double valorHoras) {
        this.valorHoras = valorHoras;
    }

    @Override
    public double calculaSalario() {
        return  ((qtdAulasPorSemana * valorHoras * 4.5) * 1.15);
    }
}
