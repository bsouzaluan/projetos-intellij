package sptech.projeto03;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/*
@RequestMapping("/musicas")
indica que todas as URIs do endpoint começam com musicas
 */
@RestController
@RequestMapping("/musicas")
public class MusicaController {


    List<Musica> musicas = new ArrayList<>();

    @GetMapping
    public List<Musica> getMusicas() {

        return musicas;
    }

    @PostMapping ("/{nome}/{interprete}/{lancamento}")
    public String cadastrar(
            @PathVariable String nome,
            @PathVariable String interprete,
            @PathVariable LocalDate lancamento) {
        Musica nova = new Musica(nome,interprete,lancamento);

        musicas.add(nova);

        return "Musica criada com id %d".formatted(nova.getId());
    }


    @PutMapping("/{id}/ouvida")

    public String ouvirMusica(@PathVariable int id){

        for (var musica : musicas){
            if(musica.getId().equals(id)){
                musica.ouvir();
                return "Musica %d atualizada".formatted(id);
            }
        }
return "Musica %d não encontrada".formatted(id);
    }



}


