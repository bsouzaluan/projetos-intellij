public class FuncionarioHoraExtra extends Funcionario{

private Double salario;
private int qtdHoraExtra;
private Double valorHoraExtra;

    public FuncionarioHoraExtra(Integer codigo, String nome, Double salario, int qtdHoraExtra, Double valorHoraExtra) {
        super(codigo, nome);
        this.salario = salario;
        this.qtdHoraExtra = qtdHoraExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getQtdHoraExtra() {
        return qtdHoraExtra;
    }

    public void setQtdHoraExtra(int qtdHoraExtra) {
        this.qtdHoraExtra = qtdHoraExtra;
    }

    public Double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(Double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }



    @Override
    public double getValorBonus() {

        return salario + getGanho();
    }

    @Override
    public String toString() {
        return "FuncionarioHoraExtra{" +
                "salario=" + salario +
                ", qtdHoraExtra=" + qtdHoraExtra +
                ", valorHoraExtra=" + valorHoraExtra +
                '}';
    }
}
