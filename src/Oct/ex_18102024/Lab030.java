package Oct.ex_18102024;
import java.util.*;

public class Lab030 {
    public static void main(String[] args) {
        //Switch condition
        //User-->>Enter int num from 1 to 7
        //which day it is -->>1-Mon, 2-Tue, 3-Wed...7-Sun, 8- Invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num's from 1 to 7: ");
        int day = sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;

        }
        sc.close();
    }
}
