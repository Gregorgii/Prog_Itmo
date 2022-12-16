package osn.mainnn;

import osn.poks.*;
import ru.ifmo.se.pokemon.Battle;
public class Prog {
    public static void main(String[] args){
        start();
    
    }
    private static void start(){
        Battle b = new Battle();

        Skrelp skrelp = new Skrelp("Борис", 1);
        Kecleon kecleon = new Kecleon("Артем", 1);
        Dragalge dragalge = new Dragalge("Барни", 1);
        Slaking slaking = new Slaking("Арсений", 1);
        Slakoth slakoth = new Slakoth("Бивис", 1);
        Vigoroth vigoroth = new Vigoroth("Анникий", 1);


        b.addAlly(skrelp);
        b.addAlly(dragalge);
        b.addAlly(slakoth);

        b.addFoe(kecleon);
        b.addFoe(vigoroth);
        b.addFoe(slaking);

        b.go();
    }

    public static boolean chance(double d) {
        return d > Math.random();
    }

}