package dataType;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;
import com.opencsv.bean.CsvRecurse;
import managers.DateConverter;
import java.time.ZonedDateTime;


/**
* The hugest class that include all info about students and calls Study group
*/

public class StudyGroup implements Comparable<StudyGroup> {

    @CsvBindByName(column = "IDOFGROUP", required = true)
    private Integer id;//Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    @CsvBindByName(column = "NAMEOFGROUP", required = true)
    private String name; //Поле не может быть null, Строка не может быть пустой
    @CsvRecurse
    private Coordinates coordinates; //Поле не может быть null
    @CsvCustomBindByName(column = "CREATIONDATE", required = true, converter = DateConverter.class)
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически

    @CsvBindByName(column = "STUDENTSCOUNT", required = true)
    private long studentsCount; //Значение поля должно быть больше 0
    @CsvBindByName(column = "SHOULDBEEXPELLED", required = true)
    private Integer shouldBeExpelled; //Значение поля должно быть больше 0, Поле может быть null
    @CsvBindByName(column = "TRANSFERREDSTUDENTS", required = true)
    private Integer transferredStudents; //Значение поля должно быть больше 0, Поле может быть null
    @CsvBindByName(column = "SEMESTER", required = false)
    private Semester semesterEnum; //Поле не может быть null
    @CsvRecurse
    private Person groupAdmin; //Поле не может быть null

    /**
     * @param id
     * @param name
     * @param coordinates
     * @param creationDate
     * @param studentsCount
     * @param shouldBeExpelled
     * @param transferredStudents
     * @param semesterEnum
     * @param groupAdmin
     */
    public StudyGroup(Integer id, String name, Coordinates coordinates, ZonedDateTime creationDate, Long studentsCount, Integer shouldBeExpelled, Integer transferredStudents, Semester semesterEnum, Person groupAdmin){
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

    public StudyGroup(){
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

    public ZonedDateTime getCreationDate(){
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


    @Override
    public int compareTo(StudyGroup o) {
        return 0;
    }
}