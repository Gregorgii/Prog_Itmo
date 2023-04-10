package managers;
import java.io.IOException;
import java.util.ArrayList;

import commands.AddCommand;
import things.*;

public class CollectionManager {
    private ArrayList<StudyGroup> groupCollection = new ArrayList<StudyGroup>();
    private FileManager fileManager;

    public CollectionManager(FileManager fileManager) {

        this.fileManager = fileManager;
        
        loadCollection();
    }
    /**
     * @return The collecton itself.
     */
    public ArrayList<StudyGroup> getCollection(){
        return groupCollection;
    }

    /**
     * @return Size of the collection.
     */
    public int collectionSize() {
        return groupCollection.size();
    }

    /**
     * @return The first element of the collection or null if collection is empty.
     */
    public StudyGroup getFirst() {
        if (groupCollection.isEmpty()) return null;
        return groupCollection.get(0);
    }

    /**
     * @return The last element of the collection or null if collection is empty.
     */
    public StudyGroup getLast() {
        if (groupCollection.isEmpty()) return null;
        return groupCollection.get(groupCollection.size());
    }

    /**
     * @param id ID of the group.
     * @return A group by his ID or null if group isn't found.
     */
    public StudyGroup getById(Long id) {
        for (StudyGroup studyGroup: groupCollection) {
            if (studyGroup.getId().equals(id)) return studyGroup;
        }
        return null;
    }

    /**
     * Adds a new group to collection.
     * @param group A group to add.
     */
    public void addToCollection(StudyGroup studyGroup) {
        groupCollection.add(studyGroup);
    }

    /**
     * Removes a group from collection.
     * @param group A group to remove.
     */
    public void removeByID(Long id) {
        groupCollection.remove(id);
    }

    /**
     * Remove group greater than the selected one.
     * @param groupToCompare A group to compare with.
     */
    public void removeGreater(StudyGroup groupToCompare) {
        groupCollection.removeIf(groupCollection -> groupCollection.compareTo(groupToCompare) > 0);
    }

    /**
     * Clears the collection.
     */
    public void clearCollection() {
        groupCollection.clear();
    }

    /**
     * Generates next ID. It will be (the bigger one + 1).
     * @return Next ID.
     */
    public Long generateNextId() {
        if (groupCollection.isEmpty()) return 1L;
        return (long) (groupCollection.get(groupCollection.size() - 1).getId() + 1);
    }

    /**
     * Saves the collection to file.
     * @throws IOException
     */
    public void saveCollection() throws IOException {
            fileManager.writeCollection(groupCollection, null);
    }

    /**
     * Loads the collection from file.
     * @throws IOException
     */
    private void loadCollection() throws IOException {
       groupCollection = fileManager.readCollection(null);
    }

    @Override
    public String toString() {
        if (groupCollection.isEmpty()) return "Коллекция пуста!";

        String info = "";
        for (StudyGroup studyGroup : groupCollection) {
            info += studyGroup;
            if (studyGroup != groupCollection.get(groupCollection.size())) info += "\n\n";
        }
        return info;
    }
}



