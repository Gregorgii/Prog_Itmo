package osn.moves.Dragalge;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove {
    public Swagger(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        Effect.confuse(p);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect e = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(e);
    }
    
    @Override
    protected String describe(){
        return "использовал Swagger";   
    }
}
