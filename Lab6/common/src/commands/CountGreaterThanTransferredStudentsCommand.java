package commands;


import utils.CollectionManager;
import utils.IoManager;
import dataType.StudyGroup;
import java.util.Iterator;

/**
 * CountGreaterThanTransferred
 */
public class CountGreaterThanTransferredStudentsCommand implements CommandInterface {
    private final CollectionManager collectionManager;

    /**
     * Constructor - creates a new CountGreaterThanTransferredStudentsCommand object with specified CollectionManager.
     * @param collectionManager - object of CollectionManager which will be set for created object.
     */
    public CountGreaterThanTransferredStudentsCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    /**
     * Returns the description of the command.
     * @return the description of the command as String.
     */
    @Override
    public String getDescription() {
        return "print count of groups where count of transferredStudents more than inputted";
    }

    /**
     * Returns the name of the command.
     * @return the name of the command as String.
     */
    @Override
    public String getName() {
        return "CountGreaterThanTransferredStudentsCommand";
    }

    /**
     * Executes the command.
     * Prompts to input integer value and counts the number of study groups where the count of transferred students is
     * greater than the provided value using Iterator. Prints the result to console.
     * If there are no such groups in the collection, prints an error message.
     * @param args - arguments of the command (not used in this command).
     */
    @Override
    public void execute(String[] args) {
        IoManager ioManager = new IoManager();
        int transferredStudents = ioManager.inputInt();
        int count = 0;
        Iterator<StudyGroup> iter = collectionManager.getIterator();
        if (collectionManager.getSize() > 0){
            while (iter.hasNext()){
                if (iter.next().getTransferredStudents() > transferredStudents){
                    count += 1;
                }
            }
            if (count == 0){
                System.out.println("Error: elements with this field doesn't exist");
            } else {
                System.out.println("There is elements with count of tranf greater than input is: " + count);
            }
        }
    }
}