package pokemons;

import attacks.*;

public class Jynx extends Smoochum {
    public Jynx(String name, int lvl) {
        super(name, lvl);
        setStats(65,50,35,115,95,95);
        setMove(new Facade(), new Blizzard(), new Rest(), new Psychic());
    }
}
