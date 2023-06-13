package src;

import exceptions.NotEnoughArgs;
import managers.CollectionManager;
import commands.Executor;

import java.io.IOException;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] args) throws NotEnoughArgs, IOException {
        if(args.length == 0) throw new NotEnoughArgs("No file path specified");
        CollectionManager groupCollection = new CollectionManager(Paths.get(args[0]));

        groupCollection.fillCollectionFromFile();

        Executor executor = new Executor(groupCollection);
        executor.enterInteractiveMode();
    }
}
