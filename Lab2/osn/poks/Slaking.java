package osn.poks;

import osn.moves.Slaking.BulkUp;
import osn.moves.Slaking.Facade;
import osn.moves.Slaking.FurySwipes;
import osn.moves.Slaking.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slaking extends Pokemon {
    public Slaking(String name, int level){
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(150, 160, 100, 95, 65, 100);

        Rest rest = new Rest(0, 0);
        Facade facade = new Facade(70, 100);
        BulkUp bulkUp = new BulkUp(0, 0);
        FurySwipes furySwipes = new FurySwipes(18, 80);

        setMove(rest, facade, bulkUp, furySwipes);
    }
    
}
