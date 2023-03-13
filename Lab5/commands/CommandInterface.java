package commands;

/**
 * Base interface for commands
 */


public interface CommandInterface {
    String getDescription();
    String getName();
    boolean execute(String argument);
}
