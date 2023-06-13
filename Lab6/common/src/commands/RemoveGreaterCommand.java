package commands;

import managers.CollectionManager;
import managers.IoManager;
import things.StudyGroup;

import java.io.IOException;

/**
 * RemoveGreater command. Remove all elements greater than input.
 */
public class RemoveGreaterCommand implements CommandInterface {
    private final CollectionManager collectionManager;
    private final IoManager ioManager = new IoManager();
    public RemoveGreaterCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;

    }

    @Override
    public void execute(String[] args) throws IOException {
        StudyGroup groupToCompare = ioManager.requestStudyGroup(collectionManager);
        collectionManager.removeGreater(groupToCompare);
        System.out.println("Элементы удалены.");
    }

    @Override
    public String getDescription() {
        return "remove all elements greater than input";
    }

    @Override
    public String getName() {
        return "remove_greater";
    }

}
