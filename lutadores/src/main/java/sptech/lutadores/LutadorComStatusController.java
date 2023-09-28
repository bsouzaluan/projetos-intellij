package sptech.lutadores;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class LutadorComStatusController {

    List<Lutador> lutadores = new ArrayList<>();

    @GetMapping("/") //localhost:8080/pizzas/
    public ResponseEntity<List<Lutador>> getPizzas() {
        if (lutadores.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(lutadores);
    }


    @GetMapping("/{codigo}")
    public ResponseEntity<Lutador> get(@PathVariable Integer codigo) {

        for (var pizza : lutadores) {

            if (pizza.getCodigo().equals(codigo)){
                return ResponseEntity.status(200).body(pizza);
            }
        }
        return  ResponseEntity.status(404).build();
    }



    @PatchMapping("/{codigo}")
    public ResponseEntity <Lutador> apanharLutador(@PathVariable int codigo, @PathVariable int forcaGolpe) {
        for (Lutador lutador : lutadores) {
            if (lutador.getCodigo() == codigo) {
                int novaVida = lutador.getVida() - forcaGolpe;
                lutador.setVida(novaVida < 0 ? 0 : novaVida);
                return ResponseEntity.status(201).body(lutador);
            }
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Lutador> getLutadoresVivos(@PathVariable Integer codigo) {
        List<Lutador> vivos = new ArrayList<>();
        for (Lutador lutador : lutadores) {
            if (lutador.getVida() > 0) {
                vivos.add(lutador);
            }
        }
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity <Lutador> getLutadoresMortos(@PathVariable Integer codigo ) {
        List<Lutador> mortos = new ArrayList<>();
        for (Lutador lutador : lutadores) {
            if (lutador.getVida() == 0) {
                mortos.add(lutador);
            }
        }
        return ResponseEntity.status(201).build();
    }

    @PatchMapping("/{codigo}")
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
