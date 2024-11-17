// child class inherited from ToDoListItem
public class RepeatedListItem extends ToDoListItem {
    private String frequency;

    // includes frequency (how often to be repeated)
    public RepeatedListItem(String name, String frequency) {
        super(name);
        this.frequency = frequency;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    // overrides parent to show frequency
    // to be used in future implementation
    @Override
    public String getDetails() {
        return "Repeats: " + frequency;
    }
}