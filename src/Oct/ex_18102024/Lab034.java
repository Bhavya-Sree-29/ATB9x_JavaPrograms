package Oct.ex_18102024;
import java.util.*;

public class Lab034 {
    public static void main(String[] args) {
        //1. Create a simple calculator that
        // performs addition, subtraction, multiplication, and division, modules
        // based on user input using switch statements.
        //Inputs : num 1, num 2, +
        //Output : num1+num2 → print information.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter operator :");
        String op = sc.next();
        switch (op)
        {
            case "+":
                System.out.println("Addition: "+(num1 + num2));
                break;
            case "-":
                System.out.println("Subtraction: "+(num1 - num2));
                break;
            case "*":
                System.out.println("Multiplication: "+(num1 * num2));
                break;
            case "/":
                System.out.println("Division: "+(num1 / num2));
                break;
            case "%":
                System.out.println("Modulo division: "+(num1 % num2));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        sc.close();
    }
}
