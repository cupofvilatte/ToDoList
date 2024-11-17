import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDoListItem> items;

    public ToDoList() {
        this.items = new ArrayList<>();
    }

    public void addItem(ToDoListItem item) {
        items.add(item);
        System.out.println("Successfully added item to list.");
    }

    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            ToDoListItem removedItem = items.remove(index);
            System.out.println("Item successfully removed.");;
        } else {
            System.out.println("Item could not be removed.");
        }
    }

    public void checkOffItem(int index) {
        if (index >= 0 && index < items.size()) {
            ToDoListItem item = items.get(index);
            item.setComplete(true);
            System.out.println("Item successfully checked off.");
        } else {
            System.out.println("Item could not be checked off.");
        }
    }

    public void displayList() {
        if (items.isEmpty()) {
            System.out.println("Your to-do list is empty!");
        } else {
            System.out.println("Your To-Do List:");
            for (int i = 0; i < items.size(); i++) {
                ToDoListItem item = items.get(i);
                System.out.println((i + 1) + ". " + item.getName() + " - " +
                    (item.isComplete() ? "Complete" : "Incomplete"));
            }
        }
    }

    public void clearCompleted() {
        items.removeIf(ToDoListItem::isComplete);
        System.out.println("Completed items cleared.");
    }
}
