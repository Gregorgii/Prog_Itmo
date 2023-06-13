package commands;


import java.util.HashMap;

/**
 * Help command. Prints info about all available commands.
 * This command uses HashMap with all commands in program to get its names and descriptions.
 */
public class HelpCommand implements CommandInterface{

    private final HashMap<String, CommandInterface> commands;

    /**
     *
     * @param commands map of commands
     */
    public HelpCommand(HashMap<String, CommandInterface> commands) {
        this.commands = commands;
    }

    @Override
    public void execute(String[] args) {
        for(String command : this.commands.keySet()){
            System.out.printf("%-35s - %s\n", command, this.commands.get(command).getDescription());
        }
    }

    @Override
    public String getDescription() {
        return "shows all available commands (this command)";
    }

    @Override
    public String getName() {
        return "Help";
    }
}
