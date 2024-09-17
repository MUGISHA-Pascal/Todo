import java.util.Scanner;

public class Todo{
public static void main(string[] args){
    Scanner scanner = new Scanner(System.in);
    class task{
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
//    using static method
    System.out.println("5. total number of tasks");
    System.out.println("------------------------------------");
    System.out.println("choose option (number):");
    String choice = scanner.nextLine();
    task[] taskCollections;
    switch (choice){
        case "add task":
            System.out.println("enter the task title :");
            String taskTitle = scanner.nextLine();
            System.out.println("enter the task description :");
            String taskDescription = scanner.nextLine();
            task taskCollection = new task();
            taskCollection.title=taskTitle;
            taskCollection.description=taskDescription;
            taskCollections.add(taskCollection);
            break;
        case "view tasks":
            for(int task=0;task<taskCollections.length;task++){
                System.out.println("available tasks : ");
                System.out.println(taskCollections[task].title,taskCollections[task].description);
            }
            break;
        case "update task":
            System.out.println("enter the title of the task to update :");
            String taskTitleUpdate = scanner.nextLine();
            System.out.println("enter the new to task description :");
            String newTaskDescription = scanner.nextLine();
            for(int task=0;task<taskCollections.length;task++){
               if(taskCollections[task].title == taskTitleUpdate){
                   taskCollections[task].description=newTaskDescription;
               }
            }
            break;
        case "delete task":
            System.out.println("enter the title of the task to delete :");
            String taskTitleDelete = scanner.nextLine();
            for(int task=0;task<taskCollections.length;task++){
                if(taskCollections[task].title == taskTitleDelete){
                    taskCollections.remove(taskCollections[task]);
                }
            }
            break;
        default:
            String errorMessage="unknown option";
            break;
    }
}
}