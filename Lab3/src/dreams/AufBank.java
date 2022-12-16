package dreams;

public enum AufBank{
    p1("Награду получает тот, кто выиграл"), p2("Слова - никуда не годное средство для выяснения, кто прав, а кто виноват"), p3("Лев не тот, кто прав, а тот, кто лев"),p4("Победитель не тот, кто победил, а тот, кто не проиграл"),p5("Думать никогда не мешает, ведь у него нет ложки");
    public String phrase;
    AufBank(String phrase){
        this.phrase = phrase;
    }
        public String getPhrase(){
            return phrase;
        }
}