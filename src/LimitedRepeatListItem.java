public class LimitedRepeatListItem extends ToDoListItem {
    private String dueDate;
    private int totalCompletionsNeeded;
    private int completions;

    public LimitedRepeatListItem(String name, String dueDate, int totalCompletionsNeeded) {
        super(name);
        this.dueDate = dueDate;
        this.totalCompletionsNeeded = totalCompletionsNeeded;
        this.completions = 0;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
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
