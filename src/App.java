public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Menu menu = new Menu();
        boolean runProgram = true;

        while (runProgram) {
            int choice = menu.getUserChoice();

            switch (choice) {
                case 1:
                    // View List
                    break;
                case 2:
                    // Check Off Item
                    break;
                case 3:
                    // Add Item
                    break;
                case 4:
                    // Delete Item
                    break;
                case 5:
                    // Quit
                    runProgram = false;
                    break;
            
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
