
import things.Betan;
import things.Bosse;
import things.Smally;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        Smally smally = new Smally("Малыш");
        Bosse bosse = new Bosse("Боссе");
        Betan betan = new Betan("Бетан");


        smally.mbsure();
        System.out.println("способ спора неправильный.");
        System.out.println(betan.telling(bosse) + " " + betan.getBadPhrase() + " ");
        System.out.println(bosse.getBadPhrase() + " парировал " + bosse.getName() + " ");
        betan.fight(bosse, betan);
        System.out.println(smally.understand());
        smally.randomPhrase();
        System.out.println("И поспешил сообщить это маме.");
        smally.PutHand();
        System.out.println("После чего воскликнул");
        smally.randomPhrase();
    }
}
