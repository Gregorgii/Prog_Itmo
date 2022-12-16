package osn.moves.kecleon;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FurySwipes extends PhysicalMove {
    public FurySwipes(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    int a = 1;
    int b = 8; 
    int ran = a + (int)(Math.random() * b);
    int kolatt;
    @Override
        protected void applyOppDamage(Pokemon def, double damage) {

        if(ran >= 1 || ran <= 3){
            super.applyOppDamage(def, damage);
            super.applyOppDamage(def, damage);
        } else if(ran >= 4 || ran <= 6){
            super.applyOppDamage(def, damage);
            super.applyOppDamage(def, damage);
            super.applyOppDamage(def, damage);
        } else if(ran == 7){
            super.applyOppDamage(def, damage);
            super.applyOppDamage(def, damage);
            super.applyOppDamage(def, damage);
            super.applyOppDamage(def, damage);
        } else {
            super.applyOppDamage(def, damage);
            super.applyOppDamage(def, damage);
            super.applyOppDamage(def, damage);
            super.applyOppDamage(def, damage);
            super.applyOppDamage(def, damage);
        }
    }
    @Override
    protected String describe(){
        return "использовал Fury Swipes";
    }
    
    
}
