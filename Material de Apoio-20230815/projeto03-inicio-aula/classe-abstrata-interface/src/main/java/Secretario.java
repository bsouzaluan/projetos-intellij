public class Secretario extends Funcionario  {


    private Double salario;
    private Double extra;

    public Secretario(Integer cpf, String nome, Double salario, Double extra) {
        super(cpf, nome);
        this.salario = salario;
        this.extra = extra;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getExtra() {
        return extra;
    }

    public void setExtra(Double extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "salario=" + salario +
                ", extra=" + extra +
                '}';
    }
}
