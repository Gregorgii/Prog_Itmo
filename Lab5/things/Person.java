package things;

import java.time.LocalDate;
/**
* The class Person th work w persons
*/

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
    /**
     * @return The persons name
     */

    public String getName(){
        return name;
    }
    /**
     * @return The persons bday
     */

    public LocalDate getBirthday(){
        return birthday;
    }
    /**
     * @return The perss weight
     */

    public Long getWeight(){
        return weight;
    }

    /**
     * @return The perss passportID
     */

    public String getPassportID(){
        return passportID;
    }

    @Override
    public int compareTo(Person personObj) {
        return passportID.compareTo(personObj.getPassportID());
    }



    
}
