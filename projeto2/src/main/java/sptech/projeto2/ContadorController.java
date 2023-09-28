package sptech.projeto2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/* as RestController são SINGLETONs
ou seja apenas 1 e somente 1 instância de cada Rest Controller
 */
@RestController
public class ContadorController {

    private int contador = 0;


    @GetMapping("/contar")
    public String contar() {
        contador++;
        return "voce ja chamou %d vezes" .formatted(contador);
    }
}
