package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Double_Team extends StatusMove {
    public Double_Team() { super(Type.NORMAL,0,0); }
    @Override
    protected void applySelfEffects(Pokemon p){ p.setMod(Stat.EVASION, +1); }
}
