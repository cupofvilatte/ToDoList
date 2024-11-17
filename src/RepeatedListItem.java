public class RepeatedListItem extends ToDoListItem {
    private String frequency;

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

    @Override
    public String getDetails() {
        return "Repeats: " + frequency;
    }
}