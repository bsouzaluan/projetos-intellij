package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FrasesController {

    @GetMapping("/comprimentar")
    public String comprimentar() {
        return  "olá";
    }

    @GetMapping("/boa-noite")
    public String boanoite() {
        return  "tenham uma boa noite";
    }
}
