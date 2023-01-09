package things;

import things.actions.RandomPhrase;
import things.actions.Sure;

public class Smally extends Person implements RandomPhrase, Sure {
    private static int age = 10;
    
    public Smally(String name) {
        super(name);        
    }

    public static class SmallysAge{
        public static int getAge() {
            return age;
        }
    }


    public class Hand {
        public void putHand() {
            System.out.println(getName() + " достал из кармана вещь под названием " + getThing());
        }
    }
     
}