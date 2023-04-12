package commands;

import managers.CollectionManager;

public class UpdateCommand extends AbstractCommand {
    private final CollectionManager collectionManager;
    private final StudyGroupParser studyGroupParser;

    public UpdateCommand(CollectionManager collectionManager, StudyGroupParser studyGroupParser) {
        this.collectionManager = collectionManager;
        this.studyGroupParser = studyGroupParser;
    }

    @Override
    public void execute() {
        int id = IoManager.inputInt("Введите id элемента, который нужно обновить:");
        if (collectionManager.isIdTaken(id)) {
            collectionManager.updateCollection(id, studyGroupParser.parseStudyGroup());
        } else {
            System.out.println("Элемент с таким id не найден.");
        }
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public boolean execute(String argument) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }
}
