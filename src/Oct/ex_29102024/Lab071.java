package Oct.ex_29102024;
import java.util.*; // or we can use import java.util.Arrays;
public class Lab071 {
    public static void main(String[] args) {
        //iterate
        int[] marks = {51, 65, 89, 94, 76};
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("Inside for loop");
        for(int i=0; i<(marks.length-1);i++)
        {
            System.out.println(marks[i]);
        }
    }
}
