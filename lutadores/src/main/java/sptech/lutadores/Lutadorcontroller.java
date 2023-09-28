package sptech.lutadores;


import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lutador")
public class Lutadorcontroller {

    List<Lutador> lutadores = new ArrayList<>();

    @GetMapping("/")
    public List<Lutador> getLutadores() {
        return lutadores;
    }


    @GetMapping("/{codigo}")
    public Lutador get(@PathVariable Integer codigo) {

        for (var lutador : lutadores) {

            if (lutador.getCodigo().equals(codigo)) {
                return lutador;
            }
        }
        return null;
    }

    @PatchMapping("/apanhar/{codigo}/{forcaGolpe}")
    public Lutador path(@PathVariable Integer codigo,
                        @PathVariable Integer forcaGolpe) {


        var lutadorEncontrado = get(codigo);
        if (lutadorEncontrado == null) {
            return null;
        }

        return lutadorEncontrado;
    }

    @PatchMapping("/apanhar/{codigo}/{forcaGolpe}")
    public Lutador apanharLutador(@PathVariable int codigo, @PathVariable int forcaGolpe) {
        for (Lutador lutador : lutadores) {
            if (lutador.getCodigo() == codigo) {
                int novaVida = lutador.getVida() - forcaGolpe;
                lutador.setVida(novaVida < 0 ? 0 : novaVida);
                return lutador;
            }
        }
        return null;
    }

    @GetMapping("/vivos")
    public List<Lutador> getLutadoresVivos() {
        List<Lutador> vivos = new ArrayList<>();
        for (Lutador lutador : lutadores) {
            if (lutador.getVida() > 0) {
                vivos.add(lutador);
            }
        }
        return vivos;
    }

    @GetMapping("/mortos")
    public List<Lutador> getLutadoresMortos() {
        List<Lutador> mortos = new ArrayList<>();
        for (Lutador lutador : lutadores) {
            if (lutador.getVida() == 0) {
                mortos.add(lutador);
            }
        }
        return mortos;
    }

    @PatchMapping("/concentracao/{codigo}")
    public Lutador concentracaoLutador(@PathVariable int codigo) {
        for (Lutador lutador : lutadores) {
            if (lutador.getCodigo() == codigo) {
                if (lutador.getVida() > 0) {
                    lutador.setVida(lutador.getVida() + 5);
                }
                return lutador;
            }
        }
        return null;
    }

}


