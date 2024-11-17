import java.time.LocalDate;

public class LimitedRepeatListItem extends ToDoListItem {
    private LocalDate dueDate;
    private int totalCompletionsNeeded;
    private int completions;

    public LimitedRepeatListItem(String name, LocalDate dueDate, int totalRepeats) {
        super(name);
        this.dueDate = dueDate;
        this.totalCompletionsNeeded = totalCompletionsNeeded;
        this.completions = 0;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public int getTotalCompletionsNeeded() {
        return totalCompletionsNeeded;
    }

    public void countCompletions() {
        if (completions < totalCompletionsNeeded) {
            completions++;
            if (completions == totalCompletionsNeeded) {
                setComplete(true);
            }
        }
    }

    @Override
    public String getDetails() {
        return "Due Date: " + dueDate + ", Completed: " + completions + "/" + totalCompletionsNeeded;
    }
}
