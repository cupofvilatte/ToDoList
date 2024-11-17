public class App {
    public static void main(String[] args) throws Exception {
        // create a new instance of todolist and menu
        ToDoList toDoList = new ToDoList();
        Menu menu = new Menu(toDoList);
        boolean runProgram = true;

        // keep running until user quits
        while (runProgram) {
            int choice = menu.getUserChoice();
            if (choice == 5) {
                // quit program
                runProgram = false;
            } else {
                menu.handleOption(choice);
            }
        }
    }
}
