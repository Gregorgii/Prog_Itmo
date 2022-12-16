package osn.moves.Slakoth;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Rest extends StatusMove {
    public Rest(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "использовал Rest";
    }
    
    
}
