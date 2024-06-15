package todolist;

import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            // Print menu options
            System.out.println("========== ToDo List App ==========");
            System.out.println("1. Add todolist.Task");
            System.out.println("2. Remove todolist.Task");
            System.out.println("3. Mark todolist.Task as Complete");
            System.out.println("4. List Tasks");
            System.out.println("5. Exit");
            System.out.println("===================================");

            System.out.print("Enter your choice: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    System.out.println("todolist.Task added!");
                    break;
                case "2":
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = Integer.parseInt(scanner.nextLine());
                    toDoList.removeTask(removeIndex - 1); // Adjust index for 0-based list
                    System.out.println("todolist.Task removed!");
                    break;
                case "3":
                    System.out.print("Enter task number to mark as complete: ");
                    int completeIndex = Integer.parseInt(scanner.nextLine());
                    toDoList.markTaskComplete(completeIndex - 1); // Adjust index for 0-based list
                    System.out.println("todolist.Task marked as complete!");
                    break;
                case "4":
                    System.out.println("========== Tasks ==========");
                    toDoList.listTasks();
                    System.out.println("===========================");
                    break;
                case "5":
                    System.out.println("Exiting ToDo List App...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        } while (!command.equals("5"));

        scanner.close();
    }
}