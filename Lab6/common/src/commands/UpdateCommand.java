package commands;

import exceptions.NotEnoughArgs;
import exceptions.WrongArgument;
import managers.CollectionManager;
import managers.IoManager;
import things.StudyGroup;

import java.io.IOException;

/**
 * Update command. Update element's fields, whose id equals input.
 */
public class UpdateCommand implements CommandInterface {
    private final CollectionManager collectionManager;
    private final IoManager ioManager;

    public UpdateCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
        this.ioManager = new IoManager();
    }


    @Override
    public String getDescription() {
        return "update element, whose id equals input";
    }

    @Override
    public String getName() {
        return "Update";
    }

    @Override
    public void execute(String[] args) throws IOException, NotEnoughArgs, WrongArgument {
        if(args.length < 2) throw new NotEnoughArgs("Command requires \"id\" argument");
        int id;
        try{
            id = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e){
            throw  new WrongArgument("Argument must be long integer number.");
        }

        StudyGroup studyGroup = collectionManager.getById(id); // get object to update
        if(studyGroup == null) throw new WrongArgument("No such element.");

        studyGroup = ioManager.requestStudyGroup(collectionManager);
    }

}
