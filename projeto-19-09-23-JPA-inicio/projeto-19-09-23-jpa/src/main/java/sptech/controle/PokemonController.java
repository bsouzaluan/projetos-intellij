package sptech.controle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sptech.dominio.Pokemon;
import sptech.repositorio.PokemonRepository;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
    @Autowired
    PokemonRepository repository;

    @GetMapping("/")
    public List<Pokemon> get(){
        return repository.findAll();
    }

    @PostMapping("/")
    public void  post(@RequestBody Pokemon novoPokemon){

        repository.save(novoPokemon);
    }

}
