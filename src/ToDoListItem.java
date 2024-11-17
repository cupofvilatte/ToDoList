public abstract class ToDoListItem {
    private String name;
    private boolean isComplete;

    // Constructor
    public ToDoListItem(String name) {
        this.name = name;
        this.isComplete = false;
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public abstract String getDetails();
}
