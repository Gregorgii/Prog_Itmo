package things.actions;


public interface Sure {
    default void mbsure(){
        final double fc = Math.random() * 100;
        if (fc < 50) {System.out.print(toString() + " был уверен: ");}
        else {System.out.print(toString() + "  не был уверен: ");}
    }
}
