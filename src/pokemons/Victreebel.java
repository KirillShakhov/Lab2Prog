package pokemons;

import attacks.*;

public class Victreebel extends Weepinbell {
    public Victreebel(String name, int lvl) {
        super(name, lvl);
        setStats(80,105,65,100,70,70);
        setMove(new Fire_Blast(), new Shadow_Ball(), new Sludge_Bomb(), new Double_Team());
    }
}
