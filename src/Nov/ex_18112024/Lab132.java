package Nov.ex_18112024;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// Throws - Checked
//Throws-->>we can handle throws in ways
//1. by using method as shown in this eg
//2. by using try,catch,finally
public class Lab132 {
    public static void main(String[] args) throws FileNotFoundException,Exception{

        FileInputStream fileInputStream = new FileInputStream("C://a.log");

    }
}
