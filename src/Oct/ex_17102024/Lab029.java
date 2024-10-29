package Oct.ex_17102024;
import java.util.*;

public class Lab029 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1:");
        int s1 = sc.nextInt();

        System.out.println("Enter side2:");
        int s2 = sc.nextInt();

        System.out.println("Enter side3:");
        int s3 = sc.nextInt();

        if(s1 == s2 && s2==s3)
        {
            System.out.println("Equilateral triangle ");
        }
        else if (s1==s2 || s2==s3 || s1==s3)
        {
            System.out.println("Isosceles triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }
    }
}
