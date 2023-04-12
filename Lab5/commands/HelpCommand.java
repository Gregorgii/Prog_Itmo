package commands;



/**
 * Class that displays the help
 */

public class HelpCommand extends AbstractCommand{
    public HelpCommand(){
        super("help", "display help");
    }

    @Override
    public boolean execute(String argument) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }
    

}


```
public class HelpCommand implements Command {
    private final CommandManager commandManager;

    public HelpCommand(CommandManager commandManager) {
        this.commandManager = commandManager;
    }

    @Override
    public void execute() {
        commandManager.getCommands().forEach((name, command) -> System.out.println(name));
    }
}

```