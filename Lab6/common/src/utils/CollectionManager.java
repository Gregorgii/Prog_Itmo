package utils;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import dataType.*;

import javax.naming.NoPermissionException;

/**
 * CollectionManager. Class for work with collection.
 */

public class CollectionManager {
    private final List<StudyGroup> groupCollection;
    private final Path defaultPath;
    private final ZonedDateTime creationDate;

    /**
     *
     * @param filePath path to the file
     * @throws IOException when some problems with IO
     */
    public CollectionManager(Path filePath) throws IOException {

        defaultPath = filePath;
        groupCollection = new ArrayList<>();
        this.creationDate = ZonedDateTime.now();
    }

    /**
     * Returns s default file path specified in class.
     * @return path
     */
    public Path getPath(){
        return defaultPath;
    }

    /**
     * getInfo. method for getting info about collection.
     * uses in Info command.
     * @return info about collection
     */
    public String getInfo() {
        String result = "";
        result += "Information about collection:\n";
        result += "Created at " + this.creationDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")) + '\n';
        result += "Collection type is " + this.groupCollection.getClass().getName() + '\n';
        result += "Amount of items stored in - " + this.groupCollection.size() + '\n';
        return result;
    }

    /**
     * getIterator. method for calling iterator.
     * @return groupCollection's iterator for some goals.
     */

    public Iterator<StudyGroup> getIterator(){
        return groupCollection.iterator();
    }

    /**
     * getCollection method for getting collection.
     * @return groupCollection
     */
    public List<StudyGroup> getCollection(){
        return groupCollection;
    }



    /**
     * Get collection size
     *
     * @return number of elements stored in collection
     */
    public int getSize(){
        return groupCollection.size();
    }

    /**
     * return element with id equals input id
     * @param id ID of the group.
     * @return A group by his ID or null if group isn't found.
     */
    public StudyGroup getById(Integer id) {
        for (StudyGroup studyGroup: groupCollection) {
            if (Objects.equals(studyGroup.getId(), id)) return studyGroup;
        }
        return null;
    }

    /**
     * Adds a new group to collection.
     * @param studyGroup A group to add.
     */
    public void addToCollection(StudyGroup studyGroup) {
        groupCollection.add(studyGroup);
    }

    /**
     * Removes object from collection with specified id.
     * @param id id of object to be removed from collection.
     * @return true if object was removed successfully, false if object with spec. id does now exist.
     */
    public boolean removeByID(int id){
        for(int index = 0; index < groupCollection.size(); index++){
            if(groupCollection.get(index).getId() == id){
                this.removeByIndex(index);
                return true;
            }
        }
        return false;
    }

    /**
     * Get element with min. value
     * @return dragon object with min. value
     */
    public StudyGroup getMax(){
        if(groupCollection.size() > 0) return Collections.max(groupCollection);
        return null;
    }


    /**
     * Removes element with specified index
     * @param index object to be removed index
     * @throws IndexOutOfBoundsException when elements with such index does not exist
     */
    public void removeByIndex(int index) throws IndexOutOfBoundsException{
        groupCollection.remove(index);
    }

    /**
     * Remove group greater than the selected one.
     * @param groupToCompare A group to compare with.
     */
    public void removeGreater(StudyGroup groupToCompare) {
        int counter = 0;

        for (StudyGroup group : groupCollection){
            if(group.compareTo(groupToCompare) > 0) {
                removeByID(group.getId());
                counter += 1;
            }
        }
        System.out.println(counter + " elements was removed");
    }


    /**
     * Get stream
     * @return stream
     */
    public Stream<StudyGroup> getStream(){
        return groupCollection.stream();
    }

    /**
     * Generates next ID. It will be (the bigger one + 1).
     * @return Next ID.
     */
    public Integer generateNextId() {
        if (groupCollection.isEmpty()) return 1;
        return (groupCollection.get(groupCollection.size() - 1).getId() + 1);
    }


    @Override
    public String toString() {
        if (groupCollection.isEmpty()) return "Коллекция пуста!";

        StringBuilder info = new StringBuilder();
        for (StudyGroup studyGroup : groupCollection) {
            info.append(studyGroup);
            if (studyGroup != groupCollection.get(groupCollection.size()-1)) info.append("\n\n");
        }
        return info.toString();
    }

    /**
     * method for filling collection from default file.
     */
    public void fillCollectionFromFile(){
        fillCollectionFromFile(defaultPath);
    }

    /**
     * Fill collection from file
     * @param path path to .csv file to load from
     */
    public void fillCollectionFromFile(Path path) {


        // check if file exist
        try{
            if(!Files.exists(path)) throw new FileNotFoundException("File " + path + " not found");
            if(!Files.isReadable(path)) throw new NoPermissionException("Cannot read file.");
            if(!Files.isWritable(path)) throw new NoPermissionException("Cannot write to file.");
        }
        catch (InvalidPathException e){
            System.out.println("Argument must be a correct file path. Data not loaded.");
            return;
        }
        catch (FileNotFoundException e){
            System.out.println("File " + path + " not found. Data not loaded."); // file does not exist
            return;
        }
        catch (NoPermissionException e){
            System.out.print("No enough permissions to " + path + " - " + e.getMessage() + " Data not loaded."); // permissions deny
            return;
        }

        try (BufferedInputStream inputStream = new BufferedInputStream(Files.newInputStream(path))){

            CSVReader reader = new CSVReader(new InputStreamReader(inputStream));
            CsvToBean<StudyGroup> csv = new CsvToBeanBuilder<StudyGroup>(reader).withType(StudyGroup.class).build();

            groupCollection.addAll(csv.parse());

            System.out.println(groupCollection.size() + " item(s) loaded from file " + path);
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        } catch (Throwable e){
            System.out.println("An error occurred while reading file. Data not loaded.");
        }
    }


}



