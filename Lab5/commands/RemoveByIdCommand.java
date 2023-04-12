package commands;

public class RemoveByIdCommand implements Command {
    private final CollectionManager collectionManager;

    public RemoveByIdCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute() {
        int id = IoManager.inputInt("Введите id элемента для удаления:");
        if (collectionManager.isIdTaken(id)) {
            collectionManager.removeFromCollection(id);
            System.out.println("Элемент удален.");
        } else {
            System.out.println("Элемент с таким id не найден.");
        }
    }
}
