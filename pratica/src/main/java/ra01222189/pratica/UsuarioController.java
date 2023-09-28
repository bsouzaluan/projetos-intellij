package ra01222189.pratica;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    List<Usuario> usuarios = new ArrayList<>();

    @PostMapping("/")
    public ResponseEntity<Usuario> post(@RequestBody Usuario novoUsuario) {

        if (novoUsuario.getEmail().isEmpty() || !novoUsuario.getEmail().contains("@") || novoUsuario.getEmail().length() < 10  ) {
            return ResponseEntity.status(400).body(novoUsuario);
        }
        usuarios.add(novoUsuario);
        return ResponseEntity.status(201).body(novoUsuario);
    }

    @GetMapping("/") //localhost:8080/pizzas/
    public ResponseEntity<List<Usuario>> getPizzas() {
        if (usuarios.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(usuarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> get(@PathVariable Integer id) {

        for (var usuario : usuarios) {

            if (usuario.getId().equals(id)){
                return ResponseEntity.status(200).body(usuario);
            }
        }
        return  ResponseEntity.status(404).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> put(@PathVariable Integer id,
                                     @RequestBody Usuario usuario) {

        if (usuario.getEmail().isEmpty() || !usuario.getEmail().contains("@") || usuario.getEmail().length() < 10  ) {
            return ResponseEntity.status(400).body(usuario);
        }
        var encontrado = get(id);
        if (encontrado.getStatusCode().value() == 404){

            return ResponseEntity.status(404).build();
        }

        int indice = usuarios.indexOf(encontrado.getBody());
        usuario.setId(id);
        usuarios.set(indice,usuario);

        return ResponseEntity.status(201).body(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {

        boolean excluiu = usuarios.removeIf(usuario -> usuario.getId().equals(id));


        int status = excluiu? 200 : 404;
        return ResponseEntity.status(status).build();
    }



}
