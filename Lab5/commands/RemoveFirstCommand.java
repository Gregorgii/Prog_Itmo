package commands;


public class RemoveFirstCommand implements Command {
    private final CollectionManager collectionManager;

    public RemoveFirstCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute() {
        if (collectionManager.size() > 0) {
            collectionManager.removeFirst();
            System.out.println("Первый элемент удален.");
        } else {
            System.out.println("Коллекция пуста.");
        }
    }
}

