package pokemons;

import attacks.*;

public class Weepinbell extends Bellsprout {
    public Weepinbell(String name, int lvl) {
        super(name, lvl);
        setStats(65,90,50,85,45,55);
        setMove(new Fire_Blast(), new Shadow_Ball(), new Sludge_Bomb());
    }
}
