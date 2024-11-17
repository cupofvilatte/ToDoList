public class App {
    public static void main(String[] args) throws Exception {
        ToDoList toDoList = new ToDoList(); // Create a ToDoList instance
        Menu menu = new Menu(toDoList);
        boolean runProgram = true;

        while (runProgram) {
            int choice = menu.getUserChoice();
            if (choice == 5) {
                runProgram = false; // Quit program
            } else {
                menu.handleOption(choice);
            }
        }
    }
}
