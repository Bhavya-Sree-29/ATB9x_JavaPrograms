package Oct.ex_29102024;
import java.util.*;

public class Lab074 {
    public static void main(String[] args) {
        //to find max/ min value in an array using inbuilt fun
        int [] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(array);
        System.out.println("Max_value = "+(array[array.length-1]));
        System.out.println("Min_value = "+(array[0]));


    }
}
