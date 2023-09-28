public class FuncionarioHorista extends Funcionario{

    private int qtdHora;
    private Double valorHora;


    public FuncionarioHorista(Integer codigo, String nome, int qtdHora, Double valorHora) {
        super(codigo, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    public int getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(int qtdHora) {
        this.qtdHora = qtdHora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double getValorBonus() {
        return getGanho() * 0.10;
    }

    @Override
    public String toString() {
        return "FuncionarioHorista{" +
                "qtdHora=" + qtdHora +
                ", valorHora=" + valorHora +
                '}';
    }
}
