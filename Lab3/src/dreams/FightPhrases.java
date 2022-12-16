package dreams;

public enum FightPhrases {
    p1("Ты жукастый таракан!"), p2("А может это ты тараканистый жукан?"), p3("В траве сидел ты, иди попей воды"),p4("А вот тебе! *ловко показал язык*"),p5("А у меня уши больше!");
    public String phrase;
    FightPhrases(String phrase){
        this.phrase = phrase;
    }
        public String getPhrase(){
            return phrase;
        }
}
