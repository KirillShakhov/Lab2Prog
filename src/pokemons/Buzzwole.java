package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Buzzwole extends Pokemon {
    public Buzzwole(String name, int lvl) {
        super (name, lvl);
        setStats(107,139,139,53,53,79);
        setType(Type.BUG, Type.FIGHTING);
        setMove(new Confide(), new Facade(), new Aerial_Ace(), new Growl());
    }
}
