package things.actions;

import dreams.FightPhrases;

public interface GetFight {
    default String getBadPhrase(){
        final double coef = Math.random() * 100;
        if (coef <= 20){System.out.println(FightPhrases.p1.getPhrase());}
        else if (coef <= 40){return (FightPhrases.p2.getPhrase());}
        else if (coef <= 60){return (FightPhrases.p3.getPhrase());}
        else if (coef <= 80){return (FightPhrases.p4.getPhrase());}
        else if (coef <= 100){return (FightPhrases.p5.getPhrase());}
        return "А ну повтори!";
        
    }
}
