public class SingleUseListItem extends ToDoListItem {
    private String dueDate;

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

    @Override
    public String getDetails() {
        return "Due Date: " + dueDate;
    }
}
