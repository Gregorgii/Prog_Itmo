package commands;

import exceptions.WrongAmountOfElementsException;
import managers.CollectionManager;
import managers.IoManager;

public class AddCommand {
    private final CollectionManager collectionManager;
    private final IoManager ioManager;

    public AddCommand(CollectionManager collectionManager, IoManager ioManager) {
        super("add {element}", "add a new element to the collection");
        this.collectionManager = collectionManager;
        this.ioManager = ioManager;
    }


    
    /**
     * The function adds an organization to the collection
     * 
     * @param argument The argument that the user entered.
     * @return the response of right execution.
     */
    @Override
    public boolean execute(String argument) {
        try{
            if(!argument.isEmpty()) throw new WrongAmountOfElementsException();
            collectionManager.addToCollection(new Organization(
                    organizationAsker.setId(),
                    organizationAsker.askName(),
                    organizationAsker.askCoordinates(),
                    organizationAsker.askCreationDate(),
                    organizationAsker.askAnnualTurnover(),
                    organizationAsker.askEmployeesCount(),
                    organizationAsker.askOrganizationType(),
                    organizationAsker.askAddress()
            ));
            Console.printLn("Organization was created successfully");
            return true;
        } catch (WrongAmountOfElementsException e){
            Console.printError("Usage of (" + argument + ") in " + getName());
        } catch (IncorrectInputInScriptException ignored) {
        }
        return false;
    }
}



public class AddCommand extends AbstractCommand {
    private final CollectionManager collectionManager;
    private final StudyGroupParser studyGroupParser;

    public AddCommand(CollectionManager collectionManager, StudyGroupParser studyGroupParser) {
        this.collectionManager = collectionManager;
        this.studyGroupParser = studyGroupParser;
    }

    @Override
    public void execute() {
        collectionManager.addToCollection(studyGroupParser.parseStudyGroup());
    }
}