package classes;
import java.util.Scanner;
public class AddTask{
       public String taskTitle="";
        public String taskDescription="";
        public void print() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the task title :");
            this.taskTitle = scanner.nextLine();
            System.out.println("the task description :");
            this.taskDescription = scanner.nextLine();
      }
}