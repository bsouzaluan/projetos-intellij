package sptech.lutadores;

import java.time.LocalDate;

public class Lutador {

    private Integer codigo;
    private String nome;
    private LocalDate nascimento;
    private Integer vida;

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
}
