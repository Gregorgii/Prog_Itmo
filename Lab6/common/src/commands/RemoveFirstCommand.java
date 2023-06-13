package commands;


import managers.CollectionManager;

/**
 * RemoveFirst command. Remove first element of collection.
 */

public class RemoveFirstCommand implements CommandInterface{
    private final CollectionManager collectionManager;

    public RemoveFirstCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public String getDescription() {
        return "remove first element of collection";
    }

    @Override
    public String getName() {
        return "remove_first";
    }

    @Override
    public void execute(String[] args) {
        if (collectionManager.getSize() > 0) {
            collectionManager.removeByIndex(0);
            System.out.println("Первый элемент удален.");
        } else {
            System.out.println("Коллекция пуста.");
        }
    }
}

