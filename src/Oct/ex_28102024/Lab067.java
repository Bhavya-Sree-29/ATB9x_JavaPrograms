package Oct.ex_28102024;

public class Lab067 {
    public static void main(String[] args) {
        //StringBuilder & StringBuffer

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        StringBuffer s = new StringBuffer("World");
        s.append(" hello");
        System.out.println(s);

                    //or

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
