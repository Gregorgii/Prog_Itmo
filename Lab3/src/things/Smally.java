package things;

import things.actions.RandomPhrase;
import things.actions.Sure;

public class Smally extends Person implements RandomPhrase, Sure {
    
    public Smally(String name) {
        super(name);
    }

    public void PutHand(){
        System.out.println(getName() + " сунул руку в вещь под названием " + getThing());
        
    }

 
     
}