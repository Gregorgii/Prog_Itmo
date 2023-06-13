package commands;

import exceptions.NotEnoughArgs;
import exceptions.WrongArgument;

import java.io.IOException;

/**
 * Base interface for commands
 */


public interface CommandInterface {

    /**
     * GetDescription method. Return command's description.
     * @return description
     */
    public String getDescription();

    /**
     * getName method. Return command's Name.
     * @return name
     */
    public String getName();

    /**
     *
     * @param args name of command
     * @throws IOException when problems with IO
     * @throws NotEnoughArgs if not enough args
     * @throws WrongArgument if type of arg is wrong
     */
    public void execute(String[] args) throws IOException, NotEnoughArgs, WrongArgument;
}
