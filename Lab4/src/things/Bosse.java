package things;

import things.actions.Fight;
import things.actions.GetFight;

public class Bosse extends Person implements Fight, GetFight {

    public Bosse(String name) {
        super(name);
    }
    
    public String saying(String persname){
        if (persname.equals("smally")){
            return "А я старше малыша, малыш - черная сажа!";
    
        }
        else {
            return null;
        }
    }
}
