// parent ToDoListItem class
public abstract class ToDoListItem {
    private String name;
    private boolean isComplete;

    // constructor
    public ToDoListItem(String name) {
        this.name = name;
        this.isComplete = false;
    }

    // getter for private name
    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    // abstract method for child classes to inherit
    public abstract String getDetails();
}
