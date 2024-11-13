package Oct.ex_23102024;

public class Lab061 {
    public static void main(String[] args) {
        //user-defined functions-->4 types
        //1. without parameter & without return type
        //2. without parameter but with return type
        //3. with parameter & without return type
        //4. with parameter & with return type
        //.
        //.
        greet();
        String returned_val = greet_with_helloo();
        System.out.println(returned_val);
    }
    //1. without parameter & without return type
    static void greet()
    {
        System.out.println("This is user defined without parameter & without return type function");
    }

    //2. without parameter but with return type
    static String greet_with_helloo()
    {
        System.out.println("This is user defined without parameter but with return type function");
        return "Type-2";
    }
}
