package Oct.ex_24102024;
import java.util.*;

public class Lab063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        System.out.println("Enter b value : ");
        int b = sc.nextInt();

        int sum_res = sum(a,b);
        System.out.println("Add : " +sum_res);

        int sub_res = sub(a,b);
        System.out.println("Sub : "+sub_res);

        int mul_res = mul(a,b);
        System.out.println("Mul : "+mul_res);

        int div_res = div(a,b);
        System.out.println("Div : "+div_res);

        int mod_res = mod(a,b);
        System.out.println("Mod : "+mod_res);


    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
    static int mod(int a, int b){
        return a%b;
    }

}

