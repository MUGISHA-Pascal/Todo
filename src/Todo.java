import java.util.Scanner;
import java.util.ArrayList;
import classes.AddTask;

class Task {
    String title;
    String description;
    static int totalNumberOfTasks = 0;
}

public class Todo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> taskCollections = new ArrayList<>();

        while (true) {
            System.out.println("welcome to smart to-do management");
            System.out.println("------------------------------------");
            System.out.println("options :");
            System.out.println("1. add task");
            System.out.println("2. view tasks");
            System.out.println("3. update task");
            System.out.println("4. delete task");
            System.out.println("5. total number of tasks");
            System.out.println("6. exit");
            System.out.println("------------------------------------");
            System.out.println("choose option (number):");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    AddTask AddTaskObj = new AddTask();
                    AddTaskObj.print();
                    Task taskCollection = new Task();
                    taskCollection.title = AddTaskObj.taskTitle;
                    taskCollection.description = AddTaskObj.taskDescription;
                    taskCollections.add(taskCollection);
                    Task.totalNumberOfTasks++;
                    break;
                case 2:
                    System.out.println("available tasks:");
                    for (Task taskValue : taskCollections) {
                        System.out.println(taskValue.title + " " + taskValue.description);
                    }
                    break;
                case 3:
                    System.out.println("enter the title of the task to update:");
                    String taskTitleUpdate = scanner.nextLine();
                    System.out.println("enter the new task description:");
                    String newTaskDescription = scanner.nextLine();
                    for (Task taskValue : taskCollections) {
                        if (taskValue.title.equals(taskTitleUpdate)) {
                            taskValue.description = newTaskDescription;
                        }
                    }
                    break;
                case 4:
                    System.out.println("enter the title of the task to delete:");
                    String taskTitleDelete = scanner.nextLine();
                    taskCollections.removeIf(taskValue -> taskValue.title.equals(taskTitleDelete));
                    break;
                case 5:
                    System.out.println("the total number of tasks is: " + Task.totalNumberOfTasks);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("unknown option");
                    break;
            }
        }
    }
}
