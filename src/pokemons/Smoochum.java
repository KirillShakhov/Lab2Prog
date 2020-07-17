package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Smoochum extends Pokemon {
    public Smoochum(String name, int lvl) {
        super (name, lvl);
        setStats(45,30,15,85,65,65);
        setType(Type.ICE, Type.PSYCHIC);
        setMove(new Facade(), new Blizzard(), new Rest());
    }
}


