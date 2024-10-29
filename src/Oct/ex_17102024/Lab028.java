package Oct.ex_17102024;
import java.util.*;

public class Lab028 {
    public static void main(String[] args) {
        System.out.println("GRADE CALCULATOR");
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //E: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Score: ");
        int score = sc.nextInt();
        if(score > 90 && score <100)
        {
            System.out.println("Grade A");
        }
        else if(score>80 && score <89)
        {
            System.out.println("Grade B");
        }
        else if(score>70 && score <79)
        {
            System.out.println("Grade C");
        }
        else if(score>60 && score <69)
        {
            System.out.println("Grade D");
        }
        else if(score>0 && score <59)
        {
            System.out.println("Grade E");
        }
        sc.close();
    }
}
