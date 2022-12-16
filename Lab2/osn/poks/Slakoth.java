package osn.poks;

import osn.moves.Slakoth.Facade;
import osn.moves.Slakoth.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slakoth extends Pokemon {
    public Slakoth(String name, int level){
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(60, 60, 60, 35, 35, 30);

        Rest rest = new Rest(0, 0);
        Facade facade = new Facade(70, 100);

        setMove(rest, facade);
    }
    
}
