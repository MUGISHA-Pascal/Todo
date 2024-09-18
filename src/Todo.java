import java.util.Scanner;
import java.util.ArrayList;
import classes.AddTask;

public class Todo {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            class Task {
                String title;
                String description;
            }
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
            ArrayList<Task> taskCollections = new ArrayList<>();
            switch (choice) {
                case 1:
                    AddTask AddTaskObj = new AddTask();
                    AddTaskObj.print();
                    Task taskCollection = new Task();
                    taskCollection.title = AddTaskObj.taskTitle;
                    taskCollection.description = AddTaskObj.taskDescription;
                    taskCollections.add(taskCollection);
                    taskCollection.totalNumberOfTasks++;
                    break;
                case 2:
                    for (Task taskValue : taskCollections) {
                        System.out.println("available tasks : ");
                        System.out.println(taskValue.title + " " + taskValue.description);
                    }
                    break;
                case 3:
                    System.out.println("enter the title of the task to update :");
                    String taskTitleUpdate = scanner.nextLine();
                    System.out.println("enter the new to task description :");
                    String newTaskDescription = scanner.nextLine();
                    for (Task taskValue : taskCollections) {
                        if (taskValue.title.equals(taskTitleUpdate)) {
                            taskValue.description = newTaskDescription;
                        }
                    }
                    break;
                case 4:
                    System.out.println("enter the title of the task to delete :");
                    String taskTitleDelete = scanner.nextLine();
                    for (Task taskValue : taskCollections) {
                        if (taskValue.title.equals(taskTitleDelete)) {
                            taskCollections.remove(taskValue);
                        }
                    }
                    break;
                case 5:
                    System.out.println("the total number of tasks is :"+taskCollection.totalNumberOfTasks);
                    break;
                case 6:
//                    process.exit();
                    break;
                default:
                    String errorMessage = "unknown option";
                    break;
            }
        }
    }
}