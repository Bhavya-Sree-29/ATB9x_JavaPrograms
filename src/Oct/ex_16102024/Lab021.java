package Oct.ex_16102024;

public class Lab021 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int res = (a >= b)? a : b;
        System.out.println("Max = "+res);
    }
}
