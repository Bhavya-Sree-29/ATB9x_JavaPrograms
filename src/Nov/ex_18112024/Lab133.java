package Nov.ex_18112024;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//Throws (2nd method rarely used):
//2. by using try,catch,finally
public class Lab133 {
    public static void main(String[] args) {
        // Throws - Checked
        try {
            FileInputStream fileInputStream = new FileInputStream("C://a.log");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("File is not found");
        } finally {
            System.out.println("yes");
        }

    }
}
