package Oct.ex_23102024;
import java.util.*;

public class Lab062 {
    public static void main(String[] args) {
        //Create a Function of Sub, Sum, Mul and Div with parameter,
        // a, b (take the parameter from the User)
        //3 → user input
        //4 - user input
        //sum(3,4)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        System.out.println("Enter b value : ");
        int b = sc.nextInt();

        //sum
        int sum_result = sum(a,b);
        System.out.println("SUM : "+sum_result);

        //sub
        int sub_result = sub(a,b);
        System.out.println("SUB : "+sub_result);

        //mul
        int mul_result = mul(a,b);
        System.out.println("MUL : "+mul_result);

        //div
        int div_result = div(a,b);
        System.out.println("DIV : "+div_result);
    }
    //sum
    static int sum(int a, int b)
    {
        return a+b;
    }

    //sub
    static int sub(int a, int b)
    {
        return a-b;
    }

    //mul
    static int mul(int a, int b)
    {
        return a*b;
    }

    //div
    static int div(int a, int b)
    {
        return a/b;
    }
}
