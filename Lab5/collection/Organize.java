package collection;
import java.time.LocalDate;
import things.*;

public class Organize implements Comparable<Organize>{
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long studentsCount; //Значение поля должно быть больше 0
    private Integer shouldBeExpelled; //Значение поля должно быть больше 0, Поле может быть null
    private Integer transferredStudents; //Значение поля должно быть больше 0, Поле может быть null
    private Semester semesterEnum; //Поле не может быть null
    private Person groupAdmin; //Поле не может быть null


    public Organize(Integer id, String name, Coordinates coordinates, java.time.LocalDate creationDate, Long studentsCount, Integer shouldBeExpelled, Integer transferredStudents, Semester semesterEnum, Person groupAdmin){
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.studentsCount = studentsCount;
        this.shouldBeExpelled = shouldBeExpelled;
        this.transferredStudents = transferredStudents;
        this.semesterEnum = semesterEnum;
        this.groupAdmin = groupAdmin;
    }


    /**
    * @return The info about Study Group (id)
    */

    public Integer getId(){
        return id;
    }
    /**
    * @return The info about Study Group (name)
    */
    public String getName(){
        return name;
    }
    /**
    * @return The info about Study Group (coordinates)
    */

    public Coordinates getCoordinates(){
        return coordinates;
    }
    /**
    * @return The info about Study Group (creation date)
    */

    public LocalDate getCreationDate(){
        return creationDate;
    }

    /**
    * @return The info about Study Group (count of studs)
    */

    public Long getStudentsCount(){
        return studentsCount;
    }
    /**
    * @return The info about Study Group (how much should be expelled)
    */
    

    public Integer getShouldBeExpelled(){
        return shouldBeExpelled;
    }
    /**
    * @return The info about Study Group (how much was transferred)
    */

    public Integer getTransferredStudents(){
        return transferredStudents;
    }
    /**
    * @return The info about Study Group (number of sem)
    */

    public Semester getSemesterEnum(){
        return semesterEnum;
    }
    /**
    * @return The info about Study Group (groups admin)
    */

    public Person getGroupAdmin(){
        return groupAdmin;
    }


    /**
     * This method is used to compare two objects
     * 
     * @param o The object to compare to.
     * @return The id of the organization.
     */
    @Override
    public int compareTo(Organize o) {
        return this.getId() - o.getId();
    }

    
    
    /**
     * Prints the organization's information
     * 
     * @return The toString() method returns a string representation of the Organization object.
     */
    @Override
    public String toString() {
        String result = String.format("Id: %d\nName: %s\nCoordinates: {x: %f, y: %d}\nCreation Date: %s\nStudents Count: %d\nShould be expelled: %d\nTransferred Students: %d\nSemester Enum: %s\nGroup Admin: %s\n",
                getId(), getName(), getCoordinates().getX(), getCoordinates().getY(), getCreationDate(), getStudentsCount(), getShouldBeExpelled(), getTransferredStudents(), getSemesterEnum(), getGroupAdmin());
        return result;
    }

}
