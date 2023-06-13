package commands;

import managers.CollectionManager;

/**
 * Info command. Print standard stream of info about collection.
 */
public class InfoCommand implements CommandInterface {
    private final CollectionManager collectionManager;

    /**
     *
     * @param collectionManager manager about who should show info
     */

    public InfoCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String[] args) {
        System.out.println(collectionManager.getInfo());
    }

    @Override
    public String getDescription() {
        return "standard stream with info about collection";
    }

    @Override
    public String getName() {
        return "Info";
    }

}
