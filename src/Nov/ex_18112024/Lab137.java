package Nov.ex_18112024;

public class Lab137 {
    public static void main(String[] args) {
        try {
            String s1 = "Pramod";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Code is closed ");
        }
    }
}
