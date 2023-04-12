package commands;

public class AddIfMaxCommand implements Command {
    private final CollectionManager collectionManager;
    private final StudyGroupParser studyGroupParser;

    public AddIfMaxCommand(CollectionManager collectionManager, StudyGroupParser studyGroupParser) {
        this.collectionManager = collectionManager;
        this.studyGroupParser = studyGroupParser;
    }

    @Override
    public void execute() {
        StudyGroup studyGroup = studyGroupParser.parseStudyGroup();
        if (collectionManager.isMax(studyGroup)) {
            collectionManager.addToCollection(studyGroup);
            System.out.println("Элемент добавлен.");
        } else {
            System.out.println("Значение элемента меньше максимального.");
        }
    }
}

