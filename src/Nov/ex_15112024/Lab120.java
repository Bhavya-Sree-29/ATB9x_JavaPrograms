package Nov.ex_15112024;

public class Lab120 {
    public static void main(String[] args) {

        // Checked - JVM Knows it during compie time
        // FileInputStream file = new FileInputStream("C://a.txt");
        // JVM knows that this may lead to file not found exception
        // so it is telling to handle it.


        // UnChecked JVM Doesn't know it during compile time. But it knows in Runtime
        int a = 10;
        int b = 10;
        b = 0;
        int c = a / b;
        System.out.println(c);


    }
}
