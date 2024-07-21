import java.util.Scanner;

class Task {
    private String description;
    private String dueDate;
    private boolean completed;

    public Task(String description, String dueDate, boolean completed) {
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return description + " (Due: " + dueDate + ") - " + (completed ? "Completed" : "Pending");
    }
}

public class TodoListManager {
    private static final int MAX_TASKS = 100;
    private static Task[] tasks = new Task[MAX_TASKS];
    private static int taskCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do List Manager:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addTask(sc);
                    break;
                case 2:
                    displayTasks();
                    break;
                case 3:
                    markTaskAsCompleted(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask(Scanner sc) {
        if(taskCount >= MAX_TASKS) {
            System.out.println("Task list is full.");
            return;
        }

        System.out.println("Enter task description: ");
        String desc = sc.nextLine();
        System.out.println("Enter due date (YYYY-MM-DD): ");
        String dueDate = sc.nextLine();

        tasks[taskCount++] = new Task(desc, dueDate, false);
        System.out.println("Task added successfully!");
    }

    private static void displayTasks() {
        if(taskCount == 0) {
            System.out.println("No tasks available!");
            return;
        }

        for (int i = 0; i < taskCount; i++) {
            System.out.println((i+1) + ". " + tasks[i]);
        }
    }

    private static void markTaskAsCompleted(Scanner sc) {
        if(taskCount == 0) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Enter task number to mark as completed: ");
        int taskNumber = sc.nextInt();

        if(taskNumber < 1 || taskNumber > taskCount) {
            System.out.println("Invalid task number!");
            return;
        }

        tasks[taskNumber - 1].setCompleted(true);
        System.out.println("Task marked as completed.");
    }
}