package managers;

import java.time.LocalDate;



import things.Coordinates;
import things.Person;
import things.Semester;
import things.StudyGroup;

public class StudyGroupParser {
    private final IoManager ioManager;

    public StudyGroupParser(IoManager ioManager) {
        this.ioManager = ioManager;
    }

    public StudyGroup parseStudyGroup() {
        Integer id = ioManager.inputInt("Введите ID группы:");
        String name = ioManager.inputString("Введите название группы:");
        Coordinates coordinates = parseCoordinates();
        LocalDate creationDate = LocalDate.now();
        long studentsCount = ioManager.inputLong("Введите количество студентов:");
        Integer shouldBeExpelled  = ioManager.inputInt("Введите количество отчисляемых:");
        Integer transferredStudents = ioManager.inputInt("Введите количество переведенных:");
        Semester semesterEnum = parseSemesterEnum();
        Person groupAdmin = parsePerson();
        
        return new StudyGroup(id, name, coordinates, creationDate, studentsCount, shouldBeExpelled, transferredStudents, semesterEnum, groupAdmin);
    }

    private Coordinates parseCoordinates() {
        Double x = ioManager.inputDouble("Введите координату x:");
        long y = ioManager.inputLong("Введите координату y:");
        return new Coordinates(x, y);
    }

    private Semester parseSemesterEnum() {
        String semesterEnum = null;
        while(semesterEnum == null ){
            try{
                semesterEnum = ioManager.inputString("Введите номер семестра:");
            } catch (Exception e) {
                System.out.println("Попробуйте ввести на английском языке капсом:");
            }
        }
        return Semester.valueOf(semesterEnum);
    }

    private LocalDate parseDate(String message) {
        LocalDate date = null;
        while (date == null) {
            try {
                date = LocalDate.parse(ioManager.inputString(message));
            } catch (Exception e) {
                System.out.println("Неверный формат даты. Попробуйте еще раз.");
            }
        }
        return date;
    }

    private Person parsePerson() {
        String name = ioManager.inputString("Введите имя:");
        LocalDate birthday = parseDate("Введите дату в формате yyyy-MM-dd:");
        long weight = ioManager.inputLong("Введите вес:");        
        String passportID = ioManager.inputString("Введите номер паспорта:");
        return new Person(name, birthday, weight, passportID);
    }

}



