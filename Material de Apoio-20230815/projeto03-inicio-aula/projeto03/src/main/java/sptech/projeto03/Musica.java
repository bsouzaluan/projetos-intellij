package sptech.projeto03;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Musica {

    private  Integer id;

    private  String nome;

    private  String interprete;

    private LocalDate lancamento;

    private  int ouvida;

    public Musica() {

        id = ThreadLocalRandom.current().nextInt(1,101);
    }

    public Musica(String nome, String interprete, LocalDate lancamento) {
        this();
        this.nome = nome;
        this.interprete = interprete;
        this.lancamento = lancamento;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getInterprete() {
        return interprete;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public int getOuvida() {
        return ouvida;
    }

    public  void ouvir(){
        this.ouvida++;
    }
}
