package sptech.projeto04;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pizzas")
public class PizzaComStatusController {

    List<Pizza> pizzas = new ArrayList<>();

    @GetMapping("/") //localhost:8080/pizzas/
    public ResponseEntity<List<Pizza>> getPizzas() {
        if (pizzas.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(pizzas);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Pizza> get(@PathVariable Integer codigo) {

        for (var pizza : pizzas) {

            if (pizza.getCodigo().equals(codigo)){
                return ResponseEntity.status(200).body(pizza);
            }
        }
        return  ResponseEntity.status(404).build();
    }

    @PostMapping("/")
    public ResponseEntity<Pizza> post(@RequestBody Pizza novaPizza) {


        pizzas.add(novaPizza);

        return ResponseEntity.status(201).body(novaPizza);
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity delete(@PathVariable Integer codigo) {

        boolean excluiu = pizzas.removeIf(pizza -> pizza.getCodigo().equals(codigo));


int status = excluiu? 200 : 404;
        return ResponseEntity.status(status).build();
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<Pizza> put(@PathVariable Integer codigo,
                     @RequestBody Pizza pizza) {

        var encontrado = get(codigo);
        if (encontrado.getStatusCode().value() == 404){

            return ResponseEntity.status(404).build();
        }

        int indice = pizzas.indexOf(encontrado.getBody());
        pizza.setCodigo(codigo);
        pizzas.set(indice,pizza);

        return ResponseEntity.status(201).body(pizza);
    }

}
