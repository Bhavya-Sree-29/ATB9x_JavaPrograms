package Nov.ex_18112024;

import java.util.Scanner;

public class Lab125 {
    public static void main(String[] args) {
        Scanner sc = null;
        sc=new Scanner(System.in);
        System.out.println("enter no.:");
        int v = sc.nextInt();
        try{
            int a = 10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally{
            sc.close();
            System.out.println("Closing...");
        }
    }
}
