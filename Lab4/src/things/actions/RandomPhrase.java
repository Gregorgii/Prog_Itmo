package things.actions;


import dreams.*;

public interface RandomPhrase {

    default void randomPhrase(){
        final double Bankcf = Math.random() * 100;
        final double coef = Math.random() * 100;


        if (Bankcf < 50){ 
            if (coef <= 20){System.out.println(AufBank.p1.getPhrase());}
            else if (coef <= 40){System.out.println(AufBank.p2.getPhrase());}
            else if (coef <= 60){System.out.println(AufBank.p3.getPhrase());}
            else if (coef <= 80){System.out.println(AufBank.p4.getPhrase());}
            else if (coef <= 100){System.out.println(AufBank.p5.getPhrase());}
        } else {
            if (coef <= 20){System.out.println(MomsBank.p1.getPhrase());}
            else if (coef <= 40){System.out.println(MomsBank.p2.getPhrase());}
            else if (coef <= 60){System.out.println(MomsBank.p3.getPhrase());}
            else if (coef <= 80){System.out.println(MomsBank.p4.getPhrase());}
            else if (coef <= 100){System.out.println(MomsBank.p5.getPhrase());}
        } 

    }
}
