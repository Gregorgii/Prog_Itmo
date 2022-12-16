package osn.moves.Slaking;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class BulkUp extends StatusMove {
    public BulkUp(double pow, double acc){
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.ATTACK, 1);
        Effect e1 = new Effect().stat(Stat.DEFENSE, 1);

        p.addEffect(e);
        p.addEffect(e1);
    }
    
    @Override
    protected String describe(){
        return "использовал Bulk Up";
    }
    
}
