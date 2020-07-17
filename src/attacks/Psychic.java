package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Psychic extends PhysicalMove {
    public Psychic() { super(Type.PSYCHIC,90,100); }
    @Override
    protected void applyOppEffects(Pokemon p){ if (Math.random() <= 0.1) p.setMod(Stat.SPECIAL_DEFENSE, -1); }
}



