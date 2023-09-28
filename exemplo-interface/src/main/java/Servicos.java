public class Servicos implements Tributavel {

    private String descricao;

    private Double preco;


    public Servicos(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public double getValorTributo() {
        return 0.30;
    }

    @Override
    public String toString() {
        return "Servicos{" +
                "descrico='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
