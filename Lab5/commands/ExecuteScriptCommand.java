package commands;

public class ExecuteScriptCommand implements Command {
    private final CommandManager commandManager;

    public ExecuteScriptCommand(CommandManager commandManager) {
        this.commandManager = commandManager;
    }

    @Override
    public void execute() {
        String fileName = IoManager.inputString("Введите имя файла:");
        commandManager.executeScript(fileName);
    }
}
    