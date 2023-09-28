package sptech.projeto2;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
public class MensagensController {

    /* aqui nossa URI possui PATH PARAM
    que é uma parte de URI que influencia no resultado da chamada.
    o path param "pessoa" recebera o valor do argumento pessoa
    porque o argumento "pessoa" está notando com @PathVariable
     */
    @GetMapping("/boas-vindas/{pessoa}")
    public String darBoasVindas(@PathVariable String pessoa) {

        return "Bem vindo a API , %s".formatted(pessoa);
    }


    /*caso existam mais de 1 path param
    todos devem estar notados
     */
    @GetMapping("/comidas-favoritas/{salgada}/{doce}")
    public String darBoasVindas(@PathVariable String salgada, @PathVariable String doce) {

        return "Sua comida salgada favorita é, %s e a doce é, %s".formatted(salgada, doce);
    }


    /*Aqui nos usamos a tecnica de query String que comporta a query param
   localhost:8080/votar?nome=joao&idade=21
   A ordem dos parametros na url não importa

   sempre ntes do primeiro parametro usamos a "?"
   e antes de cada um a partir do 2° usamos "&"
     */

    @GetMapping("/votar")
    public boolean votar(@RequestParam String nome, @RequestParam int idade) {
        System.out.println("Verificando votação p/ %s".formatted(nome));
        return idade >= 16;
    }

    @GetMapping("/potencia/{n1}/{n2}")
    public Integer potencia(@PathVariable Integer n1, @PathVariable Integer n2) {

        return (int) Math.pow(n1, n2);
    }
}

//    @GetMapping("/calcular")

//    public String calcular(@RequestParam String operacao,@RequestParam Integer n1 , @RequestParam Integer n2 {
//
//        if (operacao.equalsIgnoreCase("soma")){
//            return soma(n1+n2);
//        }
//          if (operacao.equalsIgnoreCase("subtracao")){
////            return subtracao(n1+n2);
////        }else {
//            return "operação invalida";
//        }
//
//    }
//}
