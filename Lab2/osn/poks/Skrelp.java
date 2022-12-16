package osn.poks;

import osn.moves.Sklerp.PoisonTail;
import osn.moves.Sklerp.Swagger;
import osn.moves.Sklerp.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Skrelp extends Pokemon {
    public Skrelp(String name, int level){
        super(name, level);

        super.setType(Type.POISON, Type.WATER);
        super.setStats(50, 60, 60, 60, 60, 30);

        Swagger swagger = new Swagger(0, 85);
        PoisonTail poisonTail = new PoisonTail(50, 100);
        Tackle tackle = new Tackle(40, 100);

        super.setMove(swagger, poisonTail, tackle);
    }
    

}
