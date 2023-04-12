package commands;

public class RemoveGreaterCommand implements Command {
    private final CollectionManager collectionManager;
    private final StudyGroupParser studyGroupParser;

    public RemoveGreaterCommand(CollectionManager collectionManager, StudyGroupParser studyGroupParser) {
        this.collectionManager = collectionManager;
        this.studyGroupParser = studyGroupParser;
    }

    @Override
    public void execute() {
        StudyGroup studyGroup = studyGroupParser.parseStudyGroup();
        collectionManager.removeGreater(studyGroup);
        System.out.println("Элементы удалены.");
    }
}
