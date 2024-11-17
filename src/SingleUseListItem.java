// child class inherited from ToDoListItem
public class SingleUseListItem extends ToDoListItem {
    private String dueDate;

    // includes dueDate
    public SingleUseListItem(String name, String dueDate) {
        super(name);
        this.dueDate = dueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    // overrides getDetails to show dueDate
    // to be used for future implementation
    @Override
    public String getDetails() {
        return "Due Date: " + dueDate;
    }
}
