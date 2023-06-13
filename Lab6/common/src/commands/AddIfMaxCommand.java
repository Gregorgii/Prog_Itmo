package commands;

import utils.CollectionManager;
import utils.IoManager;
import dataType.StudyGroup;

/**
 * AddIfMax command. Request element from IOManager and add it to collection if element greater than max element in collection.
 */
public class AddIfMaxCommand implements CommandInterface {
    private final CollectionManager collectionManager;

    /**
     * Constructor for AddIfMaxCommand
     * @param collectionManager - collection manager instance
     */
    public AddIfMaxCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    /**
     * @return description of command
     */
    @Override
    public String getDescription() {
        return "add element if max";
    }

    /**
     * @return name of command
     */
    @Override
    public String getName() {
        return "add if max";
    }

    /**
     * Execute command. Request element from IOManager and add it to collection if element greater than max element in collection.
     * @param args - command args
     */
    @Override
    public void execute(String[] args) {
        IoManager ioManager = new IoManager();
        StudyGroup group = ioManager.requestStudyGroup(collectionManager);
        if(collectionManager.getSize() == 0) this.collectionManager.addToCollection(group);
        else if (group.compareTo(collectionManager.getMax()) > 0){
            this.collectionManager.addToCollection(group);
            System.out.println("Element added");
        }
        else {
            System.out.println("Element not added. It is greater than min of collection");
        }
    }
}