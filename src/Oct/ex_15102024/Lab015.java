package Oct.ex_15102024;

public class Lab015 {
    public static void main(String[] args) {
        int a = 100, b = 5, c = 155, max;
        max = ((a>b) && (a>c))? a : (((b>a) && (b>c))? b : c );
        System.out.println(max);

    }
}
