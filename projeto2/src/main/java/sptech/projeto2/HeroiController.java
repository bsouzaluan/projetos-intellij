package sptech.projeto2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeroiController {

    private List<SuperHeroi> heroisInteressantes = new ArrayList<>();

    /*formato json virou padrao em Rest APis
    Por isso o Spring Boot transforma a resposta JSON
    caso não seria um valor simples (String ,Double,Int,Boolean,Integer)

    OBS: as propriedades do JSON são geradas apartir do getters
    e não atributos
     */
    @GetMapping("/heroi-favorito")

    public  SuperHeroi favorito(){
        SuperHeroi heroi = new SuperHeroi("AA","Super A",800.0,false);
        return  heroi;
    }

    @GetMapping("/herois-fortes")
    public List<SuperHeroi> fortes(){

        var lista = List.of(
                new SuperHeroi("AA","Super A", 1800.0,false),
                new SuperHeroi("BB","Super B" ,8000.0,true),
                new SuperHeroi("CC","Super C" ,3000.0,false),
                new SuperHeroi("DD","Super D", 5000.0,true)
        );
        return  lista;
    }

    @GetMapping("/novo-interessante/{nomeHeroi}/{nomeVerdadeiro}/{forca}/{voa}")

    public String heroisInteressante (@PathVariable String nomeHeroi, @PathVariable String nomeVerdadeiro, @PathVariable Double forca, @PathVariable Boolean voa ){

   var novo = new SuperHeroi(nomeHeroi,nomeVerdadeiro,forca,voa);

   heroisInteressantes.add(novo);

   return "cadastrado com sucesso";

    }


    @GetMapping("/herois-interessantes")
    public List<SuperHeroi> getHeroisInteressantes() {
        return heroisInteressantes;
    }
}
