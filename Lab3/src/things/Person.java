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
        final int rand = (int)Math.round(Math.random() * 10);
        String[] BankOfWords = {"генерал", "талант", "господь", "администрация", "слеза", "защита", "судьба", "расход", "мясо", "гражданин"};
        return BankOfWords[rand];
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
