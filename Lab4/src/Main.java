

import things.Betan;
import things.Bosse;
import things.Karlson;
import things.Smally;
import things.Smally.SmallysAge;


public class Main {
    public static void main(String[] args) {
        
        Smally smally = new Smally("Малыш");
        Smally.Hand smalHand = smally.new Hand();
        Bosse bosse = new Bosse("Боссе");
        Betan betan = new Betan("Бетан");
        Karlson karlson = new Karlson("Карлсон");

        class Program{
            public void tired(){
                System.out.println("Программа устала, пожалуйста, подождите немного");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("...");
                }
                
            }
        }



        System.out.println(karlson.seeOn((int)Math.round(Math.random() * 10) <= 5 ? karlson.getThing() : null));
        System.out.println(karlson.sharing(karlson.getThing(),  (int)Math.round(Math.random() * 10) <= 5 ? 0 : (int)Math.round(Math.random() * 10) ));
        smally.mbsure();
        System.out.println("способ спора неправильный.");
        System.out.println(betan.telling(bosse) + " " + betan.getBadPhrase() + " ");
        System.out.println(bosse.getBadPhrase() + " парировал " + bosse.getName() + " ");
        betan.fight(bosse, betan);

        Program program = new Program();
        program.tired();

        System.out.println(bosse.saying("smally"));         
        System.out.println(smally.understand());
        smally.randomPhrase();
        System.out.println("И поспешил сообщить это маме.");
        smalHand.putHand();
        System.out.println("После чего воскликнул");
        smally.randomPhrase();
        

        CallingSomeone mamaSays = new CallingSomeone() {
            String name = "Малыш!";
            public void call() {
                callSomeone(name);
            }
            public void callSomeone(String someone) {
                name = someone;
                System.out.println("Иди обедать, " + name + " Позвала Мама");
            }
        };
        mamaSays.call();
        
        System.out.println("К слову, Малышу было всего " + SmallysAge.getAge() + " лет......");
    }
}
