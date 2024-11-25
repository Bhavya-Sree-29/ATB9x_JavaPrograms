package Oct.ex_30102024;
import java.util.*;

public class Lab080 {
    public static void main(String[] args) {
        //pattern--right angle triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        for(int r=0;r<n;r++)
        {
            for(int c=0;c<=r;c++)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
