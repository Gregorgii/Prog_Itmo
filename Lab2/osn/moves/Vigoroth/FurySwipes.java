package osn.moves.Vigoroth;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class FurySwipes extends PhysicalMove {
    public FurySwipes(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    int a = 2;
    int b = 5; 
    int ran = a + (int)(Math.random() * b);


    @Override
    protected String describe(){
        return "использовал Fury Swipes";
    }
    
    
    
}
