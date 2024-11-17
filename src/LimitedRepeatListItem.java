// child class inherited from ToDoListItem
public class LimitedRepeatListItem extends ToDoListItem {
    private String dueDate;
    private int totalCompletionsNeeded;
    private int completions;

    // includes duedate, total completions needed, and times completed
    // future implementation will either inherit this from SingleUseListItem class or not include dueDate. May also just be left if no extreme redundancy occurs
    public LimitedRepeatListItem(String name, String dueDate, int totalCompletionsNeeded) {
        super(name);
        this.dueDate = dueDate;
        this.totalCompletionsNeeded = totalCompletionsNeeded;
        this.completions = 0;
    }

    // getters and setters for dueDates, completions
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getTotalCompletionsNeeded() {
        return totalCompletionsNeeded;
    }

    // to be implemented later to not mark items of this type as complete until completed certain amount of times
    public void countCompletions() {
        if (completions < totalCompletionsNeeded) {
            completions++;
            if (completions == totalCompletionsNeeded) {
                setComplete(true);
            }
        }
    }

    // override getDetails for the inherited class specific info
    // for use in future implementation
    @Override
    public String getDetails() {
        return "Due Date: " + dueDate + ", Completed: " + completions + "/" + totalCompletionsNeeded;
    }
}
