package commands;


public class PrintFieldDescendingSemesterEnumCommand implements Command {
    private final CollectionManager collectionManager;

    public PrintFieldDescendingSemesterEnumCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute() {
        collectionManager.printFieldDescendingSemesterEnum();
    }
}