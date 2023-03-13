package commands;

/**
 * Abstract class that implements the CommandInterface.
 */

public abstract class AbstractCommand implements CommandInterface{
    private final String name;
    private final String description;

    public AbstractCommand(String name, String description){
        this.name = name;
        this.description = description;
    }

    /**
     * @return The name of the command
     */

    public String getName(){
        return name;
    }

    /**
     * @return The description of the command
     */

    public String getDescription(){
        return description;
    }

    /**
     * @return The name and description
     */

    @Override
    public String toString() {
        return name + " (" + description + ")";
    }


    /**
     * @return The hashcode of the command and description
     */

    @Override
    public int hashCode() {
        return name.hashCode() + description.hashCode();
    }

    /**
     * 
     * @param obj The object to compare to.
     * @return The description of the command
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        AbstractCommand other = (AbstractCommand) obj;
        return name.equals(other.name) && description.equals(other.description);
    }
}
