package things;

import java.util.Objects;

public abstract class Person {
    public String name;
    

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name + " ";
    }

    public String understand(){
        return getName() + " понял, что ";
    }

    public String telling(Person name){
        return getName() + " сказал: " + name.getName() + ", ";
    }

    public String getThing(){
        final int rand = (int)Math.round(Math.random() * 10) - 1;
        String[] BankOfWords = {"генерал", "талант", "господь", "администрация", "слеза", "защита", "судьба", "расход", "мясо", "гражданин"};
        try {
            return BankOfWords[rand];
        } catch (Exception e) {
            return "какая-то вещь";
        }
            
    }

    public String sharing(String item, double countOfPers) {
        try{
            double col_vo = 1 / countOfPers;
            return col_vo + " фрагмент " + item + " досталась каждому";
        } catch (ArithmeticException e) {
            return "ERROR НЕЛЬЗЯ ДЕЛИТЬ НА НОЛЬ!!!!";
        }
        
    }
    
    public String seeOn(String item){
        String element;
        try {
            element = item;
            return getName() + " внимательно посмотрел на " + element.concat(" ");
        } catch (NullPointerException e) {
            return getName() + "has ShIsA!!! Found a conversation with the vOiD!!!";
        } 
        
    } 

    



    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() { 
        return Objects.hash(name);
    }

}
