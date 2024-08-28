package Task_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    private final List<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task){
        tasks.add(task);
    }
    public void removeTask(int index){
        if(index >= 0 && index < tasks.size()){
            tasks.remove(index);
        }else{
            System.out.println("Invalid index");
        }
    }
    public void listTasks(){
        System.out.println("Task List: ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\nChoose an option: ");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. List task");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the task: ");
                    String task = sc.nextLine();
                    todoList.addTask(task);
                    break;

                case 2:
                    System.out.println("Enter the index of the task to remove: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    todoList.removeTask(index - 1);
                    break;

                case 3:
                    todoList.listTasks();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
            }

        }
    }
}


//package Task_list;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class TodoList {
//    private final List<String> tasks;
//
//    public TodoList() {
//        tasks = new ArrayList<>();
//    }
//
//    public void addTask(String task) {
//        tasks.add(task);
//        System.out.println("Task added: " + task);
//    }
//
//    public void removeTask(int index) {
//        if (index >= 0 && index < tasks.size()) {
//            System.out.println("Task removed: " + tasks.get(index));
//            tasks.remove(index);
//        } else {
//            System.out.println("Invalid index, please try again.");
//        }
//    }
//
//    public void editTask(int index, String newTask) {
//        if (index >= 0 && index < tasks.size()) {
//            System.out.println("Task updated: " + tasks.get(index) + " -> " + newTask);
//            tasks.set(index, newTask);
//        } else {
//            System.out.println("Invalid index, please try again.");
//        }
//    }
//
//    public void searchTask(String keyword) {
//        System.out.println("Search results for \"" + keyword + "\":");
//        boolean found = false;
//        for (int i = 0; i < tasks.size(); i++) {
//            if (tasks.get(i).contains(keyword)) {
//                System.out.println((i + 1) + ". " + tasks.get(i));
//                found = true;
//            }
//        }
//        if (!found) {
//            System.out.println("No tasks found with the keyword \"" + keyword + "\".");
//        }
//    }
//
//    public void listTasks() {
//        if (tasks.isEmpty()) {
//            System.out.println("Your task list is empty.");
//        } else {
//            System.out.println("Task List:");
//            for (int i = 0; i < tasks.size(); i++) {
//                System.out.println((i + 1) + ". " + tasks.get(i));
//            }
//        }
//    }
//
//    public void clearTasks() {
//        tasks.clear();
//        System.out.println("All tasks have been cleared.");
//    }
//
//    public static void main(String[] args) {
//        TodoList todoList = new TodoList();
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("\nChoose an option:");
//            System.out.println("1. Add task");
//            System.out.println("2. Remove task");
//            System.out.println("3. Edit task");
//            System.out.println("4. Search task");
//            System.out.println("5. List tasks");
//            System.out.println("6. Clear tasks");
//            System.out.println("7. Exit");
//
//            int choice = -1;
//            boolean validInput = false;
//
//            while (!validInput) {
//                try {
//                    System.out.print("Enter your choice: ");
//                    choice = Integer.parseInt(sc.nextLine());
//                    validInput = true;
//                } catch (NumberFormatException e) {
//                    System.out.println("Invalid input, please enter a number.");
//                }
//            }
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter the task: ");
//                    String task = sc.nextLine();
//                    todoList.addTask(task);
//                    break;
//
//                case 2:
//                    System.out.print("Enter the index of the task to remove: ");
//                    int removeIndex = Integer.parseInt(sc.nextLine()) - 1;
//                    todoList.removeTask(removeIndex);
//                    break;
//
//                case 3:
//                    System.out.print("Enter the index of the task to edit: ");
//                    int editIndex = Integer.parseInt(sc.nextLine()) - 1;
//                    System.out.print("Enter the new task: ");
//                    String newTask = sc.nextLine();
//                    todoList.editTask(editIndex, newTask);
//                    break;
//
//                case 4:
//                    System.out.print("Enter the keyword to search for: ");
//                    String keyword = sc.nextLine();
//                    todoList.searchTask(keyword);
//                    break;
//
//                case 5:
//                    todoList.listTasks();
//                    break;
//
//                case 6:
//                    System.out.print("Are you sure you want to clear all tasks? (yes/no): ");
//                    String confirm = sc.nextLine().trim().toLowerCase();
//                    if (confirm.equals("yes")) {
//                        todoList.clearTasks();
//                    } else {
//                        System.out.println("Clear tasks cancelled.");
//                    }
//                    break;
//
//                case 7:
//                    System.out.println("Exiting...");
//                    sc.close();
//                    System.exit(0);
//                    break;
//
//                default:
//                    System.out.println("Invalid option, please try again.");
//            }
//        }
//    }
//}
//
