import java.util.Scanner;

public class Menu {
    public void displayOptions() {
        System.out.println("Please select an option:");
        System.out.println("1. View List");
        System.out.println("2. Checkoff Item");
        System.out.println("3. Add Item");
        System.out.println("4. Delete Item");
        System.out.println("5. Quit");
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
}
