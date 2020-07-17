import pokemons.*;
import ru.ifmo.se.pokemon.*;

class Battleground {
    int i = 0;

    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Buzzwole("Simon", 4));
        b.addAlly(new Smoochum("Jason", 48));
        b.addAlly(new Jynx("Mark", 45));
        b.addFoe(new Bellsprout("Gary", 63));
        b.addFoe(new Weepinbell("Martin", 21));
        b.addFoe(new Victreebel("Carl", 24));
        b.go();
    }
}
