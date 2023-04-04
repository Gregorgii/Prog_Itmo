package managers;
import java.nio.channels.FileLockInterruptionException;
import java.text.CollationElementIterator;
import java.time.LocalDateTime;
import java.util.ArrayList;

import commands.AddCommand;
import things.*;

public class CollectionManager {
    private ArrayList<Person> studentsCollection = new ArrayList<Person>();
    private FileManager fileManager;
    private LocalDateTime lastInitTime;
    private LocalDateTime lastSaveTime;

    public CollectionManager(FileManager fileManager) {
        this.lastInitTime = null;
        this.lastSaveTime = null;
        this.fileManager = fileManager;
        
        loadCollection();
    }
    /**
     * @return The collecton itself.
     */
    public ArrayList<Person> getCollection(){
        return studentsCollection;
    }
    /**
     * @return Last initialization time or null if there wasn't initialization.
     */
    public LocalDateTime getLastInitTime() {
        return lastInitTime;
    }

    /**
     * @return Last save time or null if there wasn't saving.
     */
    public LocalDateTime getLastSaveTime() {
        return lastSaveTime;
    }

    /**
     * @return Name of the collection's type.
     */
    public String collectionType() {
        return studentsCollection.getClass().getName();
    }

    /**
     * @return Size of the collection.
     */
    public int collectionSize() {
        return studentsCollection.size();
    }

    /**
     * @return The first element of the collection or null if collection is empty.
     */
    public Person getFirst() {
        if (studentsCollection.isEmpty()) return null;
        return studentsCollection.get(0);
    }

    /**
     * @return The last element of the collection or null if collection is empty.
     */
    public Person getLast() {
        if (studentsCollection.isEmpty()) return null;
        return studentsCollection.get(studentsCollection.size());
    }

    /**
     * @param id ID of the marine.
     * @return A marine by his ID or null if marine isn't found.
     */
    public Person getById(Long id) {
        for (Person person: studentsCollection) {
            if (person.getPassportID().equals(id)) return person;
        }
        return null;
    }

    /**
     * Adds a new person to collection.
     * @param person A person to add.
     */
    public void addToCollection(Person person) {
        studentsCollection.add(person);
    }

    /**
     * Removes a new marine to collection.
     * @param marine A marine to remove.
     */
    public void removeByID(Long id) {
        studentsCollection.remove(id);
    }

    /**
     * Remove marines greater than the selected one.
     * @param marineToCompare A marine to compare with.
     */
    public void removeGreater(Person personToCompapare) {
        studentsCollection.removeIf(person -> person.compareTo(personToCompapare) > 0);
    }

    /**
     * Clears the collection.
     */
    public void clearCollection() {
        studentsCollection.clear();
    }

    /**
     * Generates next ID. It will be (the bigger one + 1).
     * @return Next ID.
     */
    public Long generateNextId() {
        if (studentsCollection.isEmpty()) return 1L;
        return studentsCollection.get(studentsCollection.size() - 1).getId() + 1;
    }

    /**
     * Saves the collection to file.
     */
    public void saveCollection() {
            fileManager.writeCollection(marinesCollection);
            lastSaveTime = LocalDateTime.now();
    }

    /**
     * Loads the collection from file.
     */
    private void loadCollection() {
        marinesCollection = fileManager.readCollection();
        lastInitTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        if (marinesCollection.isEmpty()) return "Коллекция пуста!";

        String info = "";
        for (SpaceMarine marine : marinesCollection) {
            info += marine;
            if (marine != marinesCollection.last()) info += "\n\n";
        }
        return info;
    }
}

    
}


