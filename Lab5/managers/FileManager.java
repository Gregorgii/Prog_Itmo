package managers;

import com.opencsv.CSVReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import things.StudyGroup;

/**
 * Operates the file for saving/loading collection.
 */
public class FileManager {
    /**
     * Constructor for FileManager.
     * @param envVariable Environment variable for file path.
     */
    public FileManager(String envVariable) {
    }

    /**
     * Writes collection to a file.
     * @param collection Collection to write.
     * @param fileName Name of the file to write to.
     * @throws IOException If an I/O error occurs.
     */
    public void writeCollection(Collection<?> collection, String fileName) throws IOException {
        OutputStream outputStream = new FileOutputStream(fileName);
        PrintWriter printWriter = new PrintWriter(outputStream);

        // Write XML header and opening tag for collection
        printWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        printWriter.println("<collection>");

        // Write each element of the collection as a separate XML element
        for (Object element : collection) {
            printWriter.print("  <element>");
            printWriter.print(element.toString());
            printWriter.println("</element>");
        }

        // Write closing tag for collection
        printWriter.println("</collection>");

        // Close the PrintWriter and OutputStream
        printWriter.close();
        outputStream.close();
    }

    public void fillCollectionFromFile(Path path){

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

        try (InputStream inputStream = new InputStream(Files.newInputStream(path))){

            CSVReader reader = new CSVReader(new InputStreamReader(inputStream));
            CsvToBean<Dragon> csv = new CsvToBeanBuilder<Dragon>(reader).withType(Dragon.class).build();

            dragons.addAll(csv.parse());

            System.out.println(dragons.size() + " item(s) loaded from file " + path);
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());}
        catch (Throwable e){
            System.out.println("An error occurred while reading file. Data not loaded.");
        }
    }

        // Close the Scanner and InputStream
        scanner.close();
        inputStream.close();

        return collection;
    }
}
