package commands;

import java.util.Iterator;

import managers.CollectionManager;
import things.StudyGroup;

/**
 * Show command. Stream with some info about all elements of collection.
 */
public class ShowCommand implements CommandInterface{
    private final CollectionManager collectionManager;

    public ShowCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }




    @Override
    public String getDescription() {
        return "stream with all elements of collection";
    }

    @Override
    public String getName() {
        return "Show";
    }

    @Override
    public void execute(String[] args) {
        Iterator<StudyGroup> iter = collectionManager.getIterator();
        if(!iter.hasNext()){
            System.out.println("Collection is empty");
            return;
        }
        while (iter.hasNext()){
            StudyGroup studyGroup = iter.next();
            System.out.println();
            System.out.println(studyGroup.getName());
            System.out.println(studyGroup);
        }
        System.out.println("that's all groups");

    }
}
