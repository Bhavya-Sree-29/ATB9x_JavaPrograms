package Oct.ex_18102024;
import java.util.*;

public class Lab032 {
    public static void main(String[] args) {
        //switch is mainly used in web automation
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser in which you want to execute: ");
        String s = sc.next();
        switch(s)
        {
            case "chrome":
                System.out.println("Executed chrome");
                break;
            case "Edge":
                System.out.println("Executed Edge");
                break;
            case "IE":
                System.out.println("Executed Internet Explorer");
                break;
            case "Firefox":
                System.out.println("Executed Firefox");
                break;
            default:
                System.out.println("Invalid Browser");
                break;
        }
        sc.close();
    }
}
