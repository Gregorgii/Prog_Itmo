package osn.moves.kecleon;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends SpecialMove{
    public ShadowBall(double pow, double acc) {
        super(Type.GHOST, pow, acc);
    

    
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if(osn.mainnn.Prog.chance(0.2)){
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);

            p.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "использовал Shadow Ball";
    }
}
