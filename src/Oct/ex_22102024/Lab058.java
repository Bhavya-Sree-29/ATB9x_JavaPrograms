package Oct.ex_22102024;
import java.util.*;

public class Lab058 {
    public static void main(String[] args) {
        //1. Reverse the number using for loop. (In - 12345, Out - 54321)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        int rev =0;
        for(;num!=0;)
        {
            //formula for reversing a number
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println("Reverse number "+rev);

    }
}
