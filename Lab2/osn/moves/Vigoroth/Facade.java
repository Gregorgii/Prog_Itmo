package osn.moves.Vigoroth;


import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;  
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }
    
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        if(def.getCondition() == Status.BURN || def.getCondition() == Status.POISON || def.getCondition() == Status.PARALYZE){
            super.applyOppDamage(def, damage);
            super.applyOppDamage(def, damage);
        }    
            
    }

    @Override
    protected String describe(){
        return "использовал Facade";
    }
    
}
