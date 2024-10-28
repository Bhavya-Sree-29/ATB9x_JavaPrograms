package Oct.ex_15102024;

public class Lab015 {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15, max;
       // max = ((a>b))? (((b>c)? b : c) : ((a>c)? a : c));
        max = ((a>b) ? a : (a>c)? a : (b>c)? b : c);
        System.out.println(max);

    }
}
