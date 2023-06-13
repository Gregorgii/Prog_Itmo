package commands;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import exceptions.WrongArgument;
import managers.CollectionManager;
import things.StudyGroup;

import javax.naming.NoPermissionException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * Save command. Save collection to the file.
 */
public class SaveCommand implements CommandInterface {
    private final CollectionManager collectionManager;

    public SaveCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public String getDescription() {
        return "save collection to the file";
    }

    @Override
    public String getName() {
        return "Save";
    }

    @Override
    public void execute(String[] args) throws WrongArgument {
        Path path = collectionManager.getPath();;
        try{
            if(args.length > 1) path = Paths.get(args[1]); // if path passed as argument
            if(!path.isAbsolute()) path = path.toAbsolutePath();

            if(!Files.isRegularFile(path)) throw new WrongArgument("Path should be a regular file.");
            if(!Files.exists(path)) Files.createFile(path);
            if (!Files.isReadable(path)) throw new NoPermissionException("Cannot read file.");
            if (!Files.isWritable(path)) throw new NoPermissionException("Cannot write to file.");

            Writer writer = new BufferedWriter(new FileWriter(path.toFile()));
            StatefulBeanToCsv<StudyGroup> beanToCsv = new StatefulBeanToCsvBuilder<StudyGroup>(writer).build();
            beanToCsv.write(collectionManager.getStream());
            writer.close();
            System.out.println("Collection saved to file " + path + " successfully");
        }
        catch (InvalidPathException e){
            throw  new WrongArgument("Argument must be a correct file path.");
        }
        catch (NoPermissionException e){
            System.out.println("No enough permissions to " + path + " - " + e.getMessage()); // permissions deny
        }
        catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e){
            e.printStackTrace();
        }
    }

}

