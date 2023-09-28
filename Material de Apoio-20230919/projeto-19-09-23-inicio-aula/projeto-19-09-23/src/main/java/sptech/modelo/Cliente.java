package sptech.modelo;

import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.constraints.br.TituloEleitoral;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class Cliente {

    //podemos usar mais de uma notação para validação
    @NotBlank // esse só usamos para String e verifica se o campo não é nulo e espaços em branco
   @Size(min =3, max = 20)
    private  String nome;
    @PositiveOrZero
    private  int pontuacao;
    @DecimalMin("0.01")
    private  double mediaCompras;

   @PastOrPresent
   @NotNull // Pode ser usado para qualquer tipo de dado
    private LocalDate nascimento;

   @Pattern(regexp = "")
   private String telefone;

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public double getMediaCompras() {
        return mediaCompras;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
}
