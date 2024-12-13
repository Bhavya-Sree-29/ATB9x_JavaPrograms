package Nov.ex_15112024;

public class Lab117 {
    public static void main(String[] args) {
        //Exceptions
        System.out.println("Start");
        String i = args[0];
        int a = Integer.parseInt(i);
        int b = 1000/a;
        System.out.println(b);
        System.out.println("End");

        //JVM will be Initialized (From RAM)
        //Creates and Starts the main Thread. - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {20} ->
        // 2) Lab117_Exception.main()
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM
        //if you don't handle the exception, JVM will handle it
        //Then JVM will always terminate the program with exception
    }
}
