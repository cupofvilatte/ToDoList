// import libraries for array/list usage
import java.util.ArrayList;
import java.util.List;

// create ToDoList: List of Items to do
public class ToDoList {
    private List<ToDoListItem> items;

    public ToDoList() {
        this.items = new ArrayList<>();
    }

    public void addItem(ToDoListItem item) {
        items.add(item);
    }

    // method to remove an item from the list based on index
    public void removeItem(int index) {
        // conditional statement to catch incorrect input
        if (index >= 0 && index < items.size()) {
            ToDoListItem removedItem = items.remove(index);
            System.out.println("Item successfully removed:" + removedItem);
        } else {
            System.out.println("Item could not be removed.");
        }
    }

    // check off item
    // future implementation will differ based on type of list item
    public void checkOffItem(int index) {
        // conditional to catch errors
        if (index >= 0 && index < items.size()) {
            ToDoListItem item = items.get(index);
            item.setComplete(true);
            System.out.println("Item successfully checked off.");
        } else {
            System.out.println("Item could not be checked off.");
        }
    }

    // display all the list items
    public void displayList() {
        // conditional to catch errors
        if (items.isEmpty()) {
            System.out.println("Your to-do list is empty!");
        } else {
            System.out.println("===================================");
            System.out.println("Your To-Do List:");
            // for loop to print each item with a number association (index + 1)
            for (int i = 0; i < items.size(); i++) {
                ToDoListItem item = items.get(i);
                // show if item has been completed or not
                System.out.println((i + 1) + ". " + item.getName() + " - " +
                    (item.isComplete() ? "Complete" : "Incomplete"));
            }
            System.out.println("===================================");
        }
    }

    // for future implementation to deleted all completed items from list
    public void clearCompleted() {
        items.removeIf(ToDoListItem::isComplete);
        System.out.println("Completed items cleared.");
    }
}
