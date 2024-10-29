package Oct.ex_16102024;
import java.util.Scanner;
public class Lab020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();
        System.out.println("Enter Name:");
        String name = sc.next();
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +salary);
        sc.close();


    }
}
