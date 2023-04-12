package commands;

public class SaveCommand implements Command {
    private final FileManager fileManager;
    private final CollectionManager collectionManager;

    public SaveCommand(FileManager fileManager, CollectionManager collectionManager) {
        this.fileManager = fileManager;
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute() {
        fileManager.saveCollectionToFile(collectionManager.collectionElements());
        System.out.println("Коллекция сохранена.");
    }
}

