import java.util.Scanner;
// import above for user input


public class Menu {
    private ToDoList toDoList;

    public Menu(ToDoList toDoList) {
        this.toDoList = toDoList;
    }

    // display all choices for the menu
    public void displayOptions() {
        System.out.println("Please select an option:");
        System.out.println("1. View List");
        System.out.println("2. Checkoff Item");
        System.out.println("3. Add Item");
        System.out.println("4. Delete Item");
        System.out.println("5. Quit");
        System.out.println("===================================");
    }

    public int getUserChoice() {
        // future implementation will change this to secure close after use
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        
        // catch any invalid choices given by the user
        while (choice < 1 || choice > 5) {
            displayOptions();
            System.out.print("Enter your choice (1-5): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 5) {
                    System.out.println("Invalid choice. Please select a number between 1 and 5.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // keep going until valid input
            }
        }

        return choice;
    }

    // method that does most of the work for handling the user input
    public void handleOption(int choice) {
        Scanner scanner = new Scanner(System.in);

        switch (choice) {
            case 1:
                toDoList.displayList();
                break;
            case 2:
                System.out.print("Enter the number of the item to check off: ");
                String input = scanner.nextLine();
                // catch for errors if invalid input
                // if it works, check off the desired item
                try {
                    int index = Integer.parseInt(input) - 1; 
                    toDoList.checkOffItem(index);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
                break;
            case 3:
            // break into additional menu for list item type
            // future implementation will separate this as a function to be called into case 3 for simplicity and readability
            System.out.println("What type of item would you like to add?");
            System.out.println("1. Single-Use Item");
            System.out.println("2. Repeated Item");
            System.out.println("3. Limited Repeat Item");
            System.out.print("Enter your choice (1-3): ");
            
            int itemType = scanner.nextInt();
            scanner.nextLine(); // consume newline
        
            // use switch case to ask user questions based on the type of goal to accurately add the information into the list
            switch (itemType) {
                // single completion item
                case 1:
                    System.out.print("Enter the name of the item: ");
                    String singleName = scanner.nextLine();
                    System.out.print("Enter the due date (yyyy-mm-dd): ");
                    String singleDueDate = scanner.nextLine();
                    toDoList.addItem(new SingleUseListItem(singleName, singleDueDate));
                    System.out.println("Single-use item added.");
                    break;
                // routine item
                case 2:
                    System.out.print("Enter the name of the item: ");
                    String repeatedName = scanner.nextLine();
                    System.out.print("Enter the repetition type (daily/weekly/monthly): ");
                    String repetition = scanner.nextLine();
                    toDoList.addItem(new RepeatedListItem(repeatedName, repetition));
                    System.out.println("Repeated item added.");
                    break;
                // checklist item
                case 3:
                    System.out.print("Enter the name of the item: ");
                    String limitedName = scanner.nextLine();
                    System.out.print("Enter the due date (yyyy-mm-dd): ");
                    String limitedDueDate = scanner.nextLine();
                    System.out.print("Enter the number of times to complete: ");
                    int times = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    toDoList.addItem(new LimitedRepeatListItem(limitedName, limitedDueDate, times));
                    System.out.println("Limited repeat item added.");
                    break;
                default:
                    System.out.println("Invalid item type.");
            }
                break;
            case 4:
                System.out.print("Enter the number of the item to delete: ");
                String deleteInput = scanner.nextLine(); // consume newline
                // catch for errors if wrong input
                // use index to delete list items
                try {
                    int index = Integer.parseInt(deleteInput) - 1;
                    toDoList.removeItem(index);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid choice.");
                }
                break;
            // quit the program
            case 5:
                System.out.println("Exiting the program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice! Try again.");
        }
    }
}
