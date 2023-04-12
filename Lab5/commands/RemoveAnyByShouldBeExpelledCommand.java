package commands;

public class RemoveAnyByShouldBeExpelledCommand implements Command {
    private final CollectionManager collectionManager;

    public RemoveAnyByShouldBeExpelledCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute() {
        boolean removed = collectionManager.removeAnyByShouldBeExpelled(IoManager.inputBoolean("Введите значение поля shouldBeExpelled:"));
        if (removed) {
            System.out.println("Элемент удален.");
        } else {
            System.out.println("Элементов с таким значением поля нет.");
        }
    }
}
