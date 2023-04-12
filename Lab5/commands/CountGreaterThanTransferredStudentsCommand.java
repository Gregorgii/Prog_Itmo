package commands;

public class CountGreaterThanTransferredStudentsCommand implements Command {
    private final CollectionManager collectionManager;

    public CountGreaterThanTransferredStudentsCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute() {
        int transferredStudents = IoManager.inputInt("Введите значение поля transferredStudents:");
        System.out.println("Количество элементов, значение поля transferredStudents которых больше " + transferredStudents + ": " + collectionManager.countGreaterThanTransferredStudents(transferredStudents));
    }
}
