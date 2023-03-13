package things;

import java.time.LocalDate;


public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private java.time.LocalDate birthday; //Поле не может быть null
    private long weight; //Значение поля должно быть больше 0
    private String passportID; //Строка не может быть пустой, Поле не может быть null

    public Person(String name, LocalDate birthday, Long weight, String passportID){
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.passportID = passportID;
    }

    public
}
