public abstract class Produto implements Tributavel {

    //como essa classe é abstrata
    //sobrescrever o metodo da interface é opcional
    //se fosse uma classe concreta (não abstrata)
    //seria obrigatorio

    private int codigo;
    private  String descricao;
    private Double preco;

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
