package commands;

import exceptions.NotEnoughArgs;
import exceptions.WrongArgument;
import managers.CollectionManager;

import java.io.IOException;


/**
 * RemoveById command. Remove element by his ID.
 */
public class RemoveByIdCommand implements CommandInterface {
    private final CollectionManager collectionManager;

    public RemoveByIdCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }
    @Override
    public String getDescription() {
        return " remove element by his id ";
    }

    @Override
    public String getName() {
        return "remove_by_id";
    }


    /**
     * Removes object from collection with specified id.
     * @param args of object to be removed from collection.
     */
    @Override
    public void execute(String[] args) throws IOException, NotEnoughArgs, WrongArgument {
        if(args.length < 2) throw new NotEnoughArgs("Command requires \"id\" argument");
        int id;
        try{
            id = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e){
            throw  new WrongArgument("Argument must be long integer number");
        }
        boolean result = collectionManager.removeByID(id);
        if(result) System.out.println("Object removed successfully");
        else System.out.println("No such element");
    }


}

