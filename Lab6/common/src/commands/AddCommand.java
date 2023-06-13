
package commands;

import managers.CollectionManager;
import managers.IoManager;
/**
 * The AddCommand class implements the CommandInterface and represents the command to add a new element to the collection.
 * It requests a new element from the IoManager and adds it to the collection.
 */
public class AddCommand implements CommandInterface {
    // The CollectionManager instance to work with
    private final CollectionManager collectionManager;

    /**
     * Constructor method that initializes the CollectionManager instance.
     * @param collectionManager the CollectionManager instance to work with
     */
    public AddCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    /**
     * Returns a brief description of the command.
     * @return a brief description of the command
     */
    @Override
    public String getDescription() {
        return "Add new item to collection";
    }

    /**
     * Returns the name of the command.
     * @return the name of the command
     */
    @Override
    public String getName() {
        return "Add";
    }

    /**
     * Executes the command. Requests a new StudyGroup element from the IoManager and adds it to the collection.
     * @param args command arguments
     */
    @Override
    public void execute(String[] args) {
        IoManager ioManager = new IoManager();
        collectionManager.addToCollection(ioManager.requestStudyGroup(collectionManager));
    }
}