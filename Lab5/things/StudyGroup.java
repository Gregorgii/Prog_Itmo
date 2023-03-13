package things;

import java.time.LocalDate;

import javax.swing.text.TabExpander;

public class StudyGroup {
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long studentsCount; //Значение поля должно быть больше 0
    private Integer shouldBeExpelled; //Значение поля должно быть больше 0, Поле может быть null
    private Integer transferredStudents; //Значение поля должно быть больше 0, Поле может быть null
    private Semester semesterEnum; //Поле не может быть null
    private Person groupAdmin; //Поле не может быть null

    public StudyGroup(Integer id, String name, Coordinates coordinates, java.time.LocalDate creationDate, Long studentsCount, Integer shouldBeExpelled, Integer transferredStudents, Semester semesterEnum, Person groupAdmin){
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

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Coordinates getCoordinates(){
        return coordinates;
    }

    public LocalDate getCreationDate(){
        return creationDate;
    }

    public Long getStudentsCount(){
        return studentsCount;
    }

    public Integer getShouldBeExpelled(){
        return shouldBeExpelled;
    }

    public Integer getTransferredStudents(){
        return transferredStudents;
    }

    public Semester getSemesterEnum(){
        return semesterEnum;
    }

    public Person getGroupAdmin(){
        return groupAdmin;
    }

    
}