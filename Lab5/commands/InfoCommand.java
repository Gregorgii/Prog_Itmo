package commands;

public class InfoCommand extends AbstractCommand {
    private final CollectionManager collectionManager;

    public InfoCommand(CollectionManager collectionManager) {
        super("info", "print information about the collection to the standard output stream (type, initialization date, number of elements, etc.)");
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute(String argument) {
        try{
            if(!argument.isEmpty()) throw new WrongAmountOfElementsException();
            Console.printLn(collectionManager.infoAboutCollection());
            return true;
        } catch (WrongAmountOfElementsException e){
            Console.printError("Usage of (" + argument + ") in " + getName());
        }
        return false;
    }
}
