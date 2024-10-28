package Oct.ex_14102024;

public class Lab013_Type_casting {
    public static void main(String[] args) {

        //Widening-->>Converting smaller datatype to larger datatype
        //Both Implicit & Explicit castings are possible
        short s = 25;
        int a = s;//valid-->>Implicit casting
        int b = (int) s; // valid-->>Explicit casting

        //Narrowing-->>Converting Larger datatype to smaller datatype.
        // Here we will lose data while converting from larger datatype to smaller datatype
        //Implicit casting is not possible whereas Explicit casting is possible
        double val = 22.23;
        //int c = val;-->>invalid-->>Implicit casting
        int d = (int)val;// valid-->>Explicit casting

    }
}
