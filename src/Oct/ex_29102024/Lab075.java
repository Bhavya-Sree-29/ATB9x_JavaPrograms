package Oct.ex_29102024;
import java.util.*;

public class Lab075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        int[] array= new int[size];

        //to enter numbers in an array from the user
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Enter the number");
            array[i]=sc.nextInt();
        }

        //to print the numbers in an array entered by a user
        System.out.println("The numbers are:");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
