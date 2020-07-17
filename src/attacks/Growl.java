package attacks;

import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {
    public Growl() { super(Type.NORMAL,0,100); }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse (p);
        p.setMod(Stat.ATTACK, +2);
    }
}
