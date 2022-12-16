package osn.moves.kecleon;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Slash extends PhysicalMove {
    public Slash(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 1 / 8;
    }


    @Override
    protected String describe() {
        return "использовал Slash";
    }
}
