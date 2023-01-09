package things;

import things.actions.Fight;
import things.actions.GetFight;

public class Betan extends Person implements Fight, GetFight {

    public Betan(String name) {
        super(name);
    }
    
}
