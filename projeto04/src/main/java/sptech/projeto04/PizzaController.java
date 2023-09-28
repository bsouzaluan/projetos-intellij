package sptech.projeto04;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//@RestController
@RequestMapping("/pizzas")
public class PizzaController {

    List<Pizza> pizzas = new ArrayList<>();

    //Set<Pizza> pizzas2 = new LinkedHashSet();


    @GetMapping("/") //localhost:8080/pizzas/
    public List<Pizza> getPizzas() {
        return pizzas;
    }

    @GetMapping("/{codigo}")
    public Pizza get(@PathVariable Integer codigo) {

        return pizzas.stream().filter(pizza -> pizza.getCodigo().equals(codigo)).findFirst().orElse(null);

//        for (var pizza : pizzas) {
//
//            if (pizza.getCodigo().equals(codigo)){
//                return pizza;
//            }
//        }
//        return  null;
    }

    @PostMapping("/")
    public Pizza post(@RequestBody Pizza novaPizza) {


        pizzas.add(novaPizza);

        return novaPizza;
    }

    @DeleteMapping("/{codigo}")
    public String delete(@PathVariable Integer codigo) {

        boolean excluiu =
                pizzas.removeIf(pizza -> pizza.getCodigo().equals(codigo));

        String retorno = excluiu ? "Pizza %d excluida" : "Codigo %d não encontrado";

        return retorno.formatted(codigo);
    }

    @PutMapping("/{codigo}")
    public Pizza put(@PathVariable Integer codigo,
                    @RequestBody Pizza pizza) {

        var encontrado = get(codigo);
        if (encontrado == null){

            return null;
        }

     int indice = pizzas.indexOf(encontrado);
        pizza.setCodigo(codigo);
        pizzas.set(indice,pizza);

        return pizza;
    }

    @PatchMapping("/venda/{codigo}/{quantidade}")
    public Pizza vender(@PathVariable Integer codigo,@PathVariable int quantidade){

        var pizzaEncontrada = get(codigo);
        if (pizzaEncontrada == null){

            return  null;
        }

        //registrando a venda(como???)
        pizzaEncontrada.registrarVenda(quantidade);

        return  pizzaEncontrada;
    }



}
