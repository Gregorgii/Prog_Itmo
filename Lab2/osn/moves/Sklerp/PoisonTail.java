package osn.moves.Sklerp;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonTail extends PhysicalMove {
    public PoisonTail(double pow, double acc){
        super(Type.POISON, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(osn.mainnn.Prog.chance(0.1)){
            Effect.poison(p);
        }
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 1 / 8;
    }

    @Override
    protected String describe(){
        return "использовал Poison Tail";
    }
    
}
