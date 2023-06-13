package commands;


import exceptions.NotEnoughArgs;
import exceptions.WrongArgument;

import utils.CollectionManager;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Executor command. Class for execute commands.
 * Realize command pattern.
 */

public class Executor {

    private final HashMap<String, CommandInterface> commands;

    /**
     * Constructor for command executor.
     *
     * @param collectionManager collection manager class object
     */
    public Executor(CollectionManager collectionManager){
        this.commands = new HashMap<>();

        commands.put("add", new AddCommand(collectionManager));
        commands.put("add_if_max", new AddIfMaxCommand(collectionManager));
        commands.put("show", new ShowCommand(collectionManager));
        commands.put("clear", new ClearCommand(collectionManager));
        commands.put("exit", new ExitCommand());
        commands.put("info", new InfoCommand(collectionManager));
        commands.put("remove_by_id", new RemoveByIdCommand(collectionManager));
        commands.put("update", new UpdateCommand(collectionManager));
        commands.put("save", new SaveCommand(collectionManager));
        commands.put("remove_first", new RemoveFirstCommand(collectionManager));
        commands.put("remove_greater", new RemoveGreaterCommand(collectionManager));
        commands.put("remove_any_by_should_be_expelled", new RemoveAnyByShouldBeExpelledCommand(collectionManager));
        commands.put("count_greater_than_transferred_students", new CountGreaterThanTransferredStudentsCommand(collectionManager));
        commands.put("print_field_descending_semester_enum", new PrintFieldDescendingSemesterEnumCommand(collectionManager));
        commands.put("execute_script", new ExecuteScriptCommand(this));
        commands.put("help", new HelpCommand(this.commands));



    }

    /**
     * Enter an interactive mode with CLI commands execution.
     */
    public void enterInteractiveMode(){
        System.out.println("Interactive mode");
        Scanner commandReader = new Scanner(System.in);

        while (true){
            System.out.println("Enter a command"); // read command from terminal

            try{
                String[] argsArray = parseInput(commandReader.nextLine());

                CommandInterface command = getCommand(argsArray[0]);

                if (command == null){
                    System.out.println("Not a command. Try again.");
                    continue;
                }
                // try to execute command with arguments
                command.execute(argsArray);
            }
            catch (WrongArgument e){
                System.out.println("Wrong argument! " + e.getMessage() + " Try again.");
            }
            catch (NotEnoughArgs e){
                System.out.println("Not enough arguments. " + e.getMessage() + " Try again.");
            }
            catch (NoSuchElementException e){
                System.out.println("Exit command");
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    CommandInterface getCommand(String commandName){
        if(!commands.containsKey(commandName)) return null; // check if command exist
        return commands.get(commandName);
    }

    String[] parseInput(String raw){
        if(raw.length() == 0) return new String[]{""};
        Matcher mather = Pattern.compile("[^\" ]+|\"[^\"]*\"").matcher(raw);

        ArrayList<String> line = new ArrayList<>();
        while (mather.find()) {line.add(mather.group().replaceAll("\"", ""));} // split arguments with regEx

        String[] argsArray = new String[line.size()]; // convert to String array
        argsArray = line.toArray(argsArray);
        argsArray[0] = argsArray[0].toLowerCase(); // command name to lover
        return argsArray;
    }
}