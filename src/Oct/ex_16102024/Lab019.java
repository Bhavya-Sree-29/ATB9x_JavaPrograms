package Oct.ex_16102024;
import java.util.Scanner;

public class Lab019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        //In case of float:-->> float age = sc.nextFloat();
        System.out.println((age>25) ? "Allowed" : "Not Allowed");
        sc.close();

    }
}
