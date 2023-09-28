package sptech.projeto2;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SuperHeroi {
    private String nomeHeroi;

    @JsonIgnore
    private String nomeVerdadeiro;

    private  Double forca;

    private Boolean voa;

    public SuperHeroi(String nomeHeroi, String nomeVerdadeiro, Double forca, Boolean voa) {
        this.nomeHeroi = nomeHeroi;
        this.nomeVerdadeiro = nomeVerdadeiro;
        this.forca = forca;
        this.voa = voa;
    }

    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public String getNomeVerdadeiro() {
        return nomeVerdadeiro;
    }

    public void setNomeVerdadeiro(String nomeVerdadeiro) {
        this.nomeVerdadeiro = nomeVerdadeiro;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

//    public Boolean getPodeVoar() {
//        return voa;
//    }

    public void setVoa(Boolean voa) {
        this.voa = voa;
    }


    /*
    Aqui criamos um :
    Atributo virtual ou
    Campo virtual ou
    Atributo calculAdo ou
    Campo calculado
     */
    public  String getCategoria() {
        return  forca < 1000 ? "Fraco" : "Forte";
    }
}
