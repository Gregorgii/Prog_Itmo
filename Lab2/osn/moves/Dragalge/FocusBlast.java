package osn.moves.Dragalge;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends SpecialMove {
    public FocusBlast(double pow, double acc){
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if(osn.mainnn.Prog.chance(0.1)){
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);

            p.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "использовал Focus Blast";
    }
    
}
