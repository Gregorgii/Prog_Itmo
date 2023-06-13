package commands;

import managers.CollectionManager;

/**
 * Clear command. Delete all elements from file.
 */

public class ClearCommand implements CommandInterface {
    private final CollectionManager collectionManager;

    /**
     * Creates a new ClearCommand.
     *
     * @param collectionManager The CollectionManager that will be used to clear the collection.
     */
    public ClearCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    /**
     * Gets the description of the ClearCommand.
     *
     * @return The description of the ClearCommand.
     */
    @Override
    public String getDescription() {
        return "Clear collection";
    }

    /**
     * Gets the name of the ClearCommand.
     *
     * @return The name of the ClearCommand.
     */
    @Override
    public String getName() {
        return "Clear";
    }

    /**
     * Executes the ClearCommand by clearing the collection of the CollectionManager and printing a message to the console.
     *
     * @param args The arguments to be passed to the ClearCommand. This command takes no arguments, so this parameter is ignored.
     */
    @Override
    public void execute(String[] args) {
        collectionManager.getCollection().clear();
        System.out.println("Коллекция очищена.");
    }

}