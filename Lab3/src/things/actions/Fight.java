package things.actions;

import things.Person;

public interface Fight {
    default void fight(Person fightPerson1, Person fightPerson2){
         final double cf = Math.random() * 100;
         System.out.print(fightPerson1.toString() + " и " + fightPerson2.toString() + " подрались. ");
         if (cf < 50){System.out.println("Победил " + fightPerson1);}
         else {System.out.println("Победил " + fightPerson2);}
    }
}
