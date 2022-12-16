package things;

import things.actions.Fight;
import things.actions.GetFight;

public class Bosse extends Person implements Fight, GetFight {

    public Bosse(String name) {
        super(name);
    }
    
}
