package commands;


import exceptions.NotEnoughArgs;
import exceptions.WrongArgument;
import managers.CollectionManager;
import things.StudyGroup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * PrintFieldDescendingSemesterEnum command. Print number of semester for all from great to less.
 */
public class PrintFieldDescendingSemesterEnumCommand implements CommandInterface {
    private final CollectionManager collectionManager;

    public PrintFieldDescendingSemesterEnumCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public String getDescription() {
        return "Print number of Semester for all elements from great to less";
    }

    @Override
    public String getName() {
        return "print field descending semester enum";
    }

    @Override
    public void execute(String[] args) throws IOException, NotEnoughArgs, WrongArgument {
        ArrayList<StudyGroup> copyOfCollection = collectionManager.getCollection();
        copyOfCollection.sort(Collections.reverseOrder());
        for (StudyGroup studyGroup : copyOfCollection){
            System.out.println(studyGroup.getSemesterEnum());
        }

    }
}