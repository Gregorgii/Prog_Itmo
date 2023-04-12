package managers;

import java.time.LocalDateTime;

import things.Coordinates;
import things.Person;
import things.StudyGroup;

public class StudyGroupParser {
    private final IoManager ioManager;

    public StudyGroupParser(IoManager ioManager) {
        this.ioManager = ioManager;
    }

    public StudyGroup parseStudyGroup() {
        Integer id = 
        String name = ioManager.inputString("Введите имя:");
        Coordinates coordinates = parseCoordinates();
        LocalDateTime creationDate = LocalDateTime.now();
        int studentsCount = ioManager.inputInt("Введите количество студентов:");
        
        Person groupAdmin = parsePerson();
        return new StudyGroup(name, coordinates, creationDate, studentsCount, formOfEducation, groupAdmin);
    }

    private Coordinates parseCoordinates() {
        int x = ioManager.inputInt("Введите координату x:");
        double y = ioManager.inputDouble("Введите координату y:");
        return new Coordinates(x, y);
    }

    private FormOfEducation parseFormOfEducation() {
        FormOfEducation formOfEducation = null;
        while (formOfEducation == null) {
            try {
                formOfEducation = FormOfEducation.valueOf(ioManager.inputString("Введите форму обучения(" + Arrays.toString(FormOfEducation.values()) + "):").toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Неверное значение. Попробуйте еще раз.");
            }
        }
        return formOfEducation;
    }

    private Person parsePerson() {
        String name = ioManager.inputString("Введите имя админа:");
        long height = ioManager.inputLong("Введите рост админа:");
        String passportID = ioManager.inputString("Введите номер паспорта админа:");
        Color hairColor = parseHairColor();
        Country nationality = parseNationality();
        return new Person(name, height, passportID, hairColor, nationality);
    }

    private Color parseHairColor() {
        Color hairColor = null;
        while (hairColor == null) {
            try {
                hairColor = Color.valueOf(ioManager.inputString("Введите цвет волос(" + Arrays.toString(Color.values()) + "):").toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Неверное значение. Попробуйте еще раз.");
            }
        }
        return hairColor;
    }

    private Country parseNationality() {
        Country nationality = null;
        while (nationality == null) {
            try {
                nationality = Country.valueOf(ioManager.inputString("Введите национальность(" + Arrays.toString(Country.values()) + "):").toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Неверное значение. Попробуйте еще раз.");
            }
        }
        return nationality;
    }
}
