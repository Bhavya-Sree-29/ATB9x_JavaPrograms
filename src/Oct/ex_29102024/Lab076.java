package Oct.ex_29102024;
import java.util.*;
public class Lab076 {
    public static void main(String[] args) {
        //Write a function to determine if there are any duplicates in an array.
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] array=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter number" + (i+1));
            array[i]= sc.nextInt();
        }

        Duplicate_array(array);

    }

    static void Duplicate_array(int[] array) {
        for (int i=0;i<array.length;i++)
        {
            for (int j=i+1;j<array.length;j++)
            {
                if (array[i] == array[j])
                    System.out.println("Duplicate number in array" + array[j]);
            }
        }

    }
}
