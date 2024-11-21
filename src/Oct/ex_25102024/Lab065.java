package Oct.ex_25102024;

public class Lab065 {
    public static void main(String[] args) {
        //StringBuffer

        StringBuffer stringBuffer = new StringBuffer("Akhil");

        stringBuffer.append("Koduri");         // Append text
        stringBuffer.insert(5 , "Hi");  // Insert text

        System.out.println(stringBuffer);

        //StringBuilder

        StringBuilder stringBuilder = new StringBuilder("Koduri");

        stringBuilder.append("Akhil");
        stringBuilder.insert(6, "Bye");

        System.out.println(stringBuilder);

    }
}
