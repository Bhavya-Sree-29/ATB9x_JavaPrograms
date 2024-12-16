package Nov.ex_18112024;

public class Lab130 {
    public static void main(String[] args) {
        //interview q/a
        final double pi = 3.14;
        int a= 0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("div by Zero");
        } finally {
            System.out.println("I will be executed anyHow!!");
        }
    }
}
