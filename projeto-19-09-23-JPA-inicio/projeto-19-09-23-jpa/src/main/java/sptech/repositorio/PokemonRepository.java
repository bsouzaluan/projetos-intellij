package sptech.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.dominio.Pokemon;

public interface PokemonRepository  extends JpaRepository<Pokemon, Integer> {

}
