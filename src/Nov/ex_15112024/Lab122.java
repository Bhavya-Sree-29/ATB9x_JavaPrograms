package Nov.ex_15112024;

public class Lab122 {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Can't do trim for Null, ARE you mad?");
        }
        System.out.println("End");
    }
}
