package Oct.ex_17102024;

import java.util.Scanner;

public class Lab023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("Allowed");
        }
        else
        {
            System.out.println("Not Allowed");
        }
        sc.close();
    }
}
