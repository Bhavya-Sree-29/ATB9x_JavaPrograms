package Nov.ex_15112024;

public class Lab119 {
    public static void main(String[] args) {
        System.out.println("Start of program");

        String ip = args[0]; // ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // NumberFormatException: For input string: "pramod"
        int b = 1000 / a; // ArithmeticException: / by zero
        System.out.println(b);

        System.out.println("End of program");

        //ArrayIndexOutOfBoundsException:
        //It occurs when we don't pass any args for args[0] then JVM will throw this exception

        //NumberFormatException:
        //It occurs when we pass any String as args for args[0] since we are converting String into int by using parseInt()
        // then JVM will throw this exception

        //ArithmeticException:
        //It occurs when we pass zero as args for args[0] then JVM will throw this exception

    }
}
