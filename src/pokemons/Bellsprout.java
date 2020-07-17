package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int lvl) {
        super (name, lvl);
        setStats(50,75,35,70,30,40);
        setType(Type.GRASS, Type.POISON);
        setMove(new Fire_Blast(), new Shadow_Ball());
    }
}
