package dreams;

public enum MomsBank{
    p1("А кто будет? Пушкин что ли?"), p2("Пока все не съешь, из-за стола не выйдешь"), p3("Вот 18 стукнет - сразу на все 4 стороны"),p4("За компьютером сидишь, вот в голове и кавардак"),p5("*Грозно берет полотенце*");
    public String phrase;
    MomsBank(String phrase){
        this.phrase = phrase;
    }
        public String getPhrase(){
            return phrase;
        }
}
