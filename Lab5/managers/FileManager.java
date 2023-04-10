package managers;

import java.io.*;
import java.util.*;

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

    /**
     * Reads collection from a file.
     * @param fileName Name of the file to read from.
     * @return Read collection.
     * @throws IOException If an I/O error occurs.
     */
    public ArrayList<StudyGroup> readCollection(String fileName) throws IOException {
        InputStream inputStream = new FileInputStream(fileName);
        Scanner scanner = new Scanner(inputStream);

        Collection<String> collection = new ArrayList<>();

        // Read each line of the file and add any elements to the collection
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();

            if (line.startsWith("<element>") && line.endsWith("</element>")) {
                String element = line.substring("<element>".length(), line.length() - "</element>".length());
                collection.add(element);
            }
        }

        // Close the Scanner and InputStream
        scanner.close();
        inputStream.close();

        return collection;
    }
}