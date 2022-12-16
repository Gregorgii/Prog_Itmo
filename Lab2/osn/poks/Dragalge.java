package osn.poks;

import osn.moves.Dragalge.FocusBlast;
import osn.moves.Dragalge.PoisonTail;
import osn.moves.Dragalge.Swagger;
import osn.moves.Dragalge.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dragalge extends Pokemon {
    public Dragalge(String name, int level){
        super(name, level);

        super.setType(Type.POISON, Type.DRAGON);
        super.setStats(65, 75, 90, 97, 123, 44);

        Swagger swagger = new Swagger(0, 85);
        PoisonTail poisonTail = new PoisonTail(50, 100);
        Tackle tackle = new Tackle(40, 100);
        FocusBlast focusBlast = new FocusBlast(120, 70);
        

        setMove(swagger, poisonTail, tackle, focusBlast);
    }
    
}
