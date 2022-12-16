package osn.moves.kecleon;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Thunder extends SpecialMove{
    public Thunder(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);


    }
    
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if(osn.mainnn.Prog.chance(0.3) && p.hasType(Type.ELECTRIC)){
            Effect.freeze(p);
        }
    }

    @Override
    protected String describe() {
        return "использовал Thunder";
    }

    
}
