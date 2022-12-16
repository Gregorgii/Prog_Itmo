package osn.moves.Dragalge;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends PhysicalMove {
    public Tackle(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected String describe(){
        return "использовал Tackle";
    }
    
}
