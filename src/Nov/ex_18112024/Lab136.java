package Nov.ex_18112024;

public class Lab136 {
    public static void main(String[] args) {
        try {
            int a = 10/10;
            //System.exit(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Not Printed");
        }

    }
}
