package commands;

import java.io.IOException;

/**
 * Exit command. Exit from program without saving to the file.
 */
public class ExitCommand implements CommandInterface {
    @Override
    public String getDescription() {
        return "exit wo save to the file";
    }

    @Override
    public String getName() {
        return "Exit";
    }

    @Override
    public void execute(String[] args) throws IOException {
        System.exit(0);
    }
}
