package Oct.ex_17102024;
import java.util.*;

public class Lab026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value :");
        int a = sc.nextInt();
        if (a%2 == 0)
        {
            System.out.println("Even num");
        }
        else
        {
            System.out.println("Odd num");
        }
        sc.close();
    }
}
