package osn.poks;

import osn.moves.Vigoroth.Facade;
import osn.moves.Vigoroth.FurySwipes;
import osn.moves.Vigoroth.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vigoroth extends Pokemon {
    public Vigoroth(String name, int level){
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(80, 80, 80, 55, 55, 90);

        Facade facade = new Facade(70, 100);
        Rest rest = new Rest(0, 0);
        FurySwipes furySwipes = new FurySwipes(18, 80);

        setMove(facade, rest, furySwipes);

    }
    
}
