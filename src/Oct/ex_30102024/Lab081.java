package Oct.ex_30102024;
import java.util.*;

public class Lab081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();

        for(int r=0;r<n;r++)
        {
            for(int c=n;c>r;c--)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
