public abstract class Funcionario implements Ibonavel{

    private Integer codigo;
    private String nome;

    private int qtdHora;
    private Double valorHora;


    public Funcionario(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Double getGanho(){

        return qtdHora * valorHora;

    }
    @Override
    public double getValorBonus() {
        return 0;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
