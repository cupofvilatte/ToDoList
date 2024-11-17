import java.time.LocalDate;

public class SingleUseListItem extends ToDoListItem {
    private LocalDate dueDate;

    public SingleUseListItem(String name, LocalDate dueDate) {
        super(name);
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String getDetails() {
        return "Due Date: " + dueDate;
    }
}
