package Nov.ex_07112024.SingleInheritance4_Lab093;

public class Testcase1 extends Common_test{
    Testcase1() {
        System.out.println("Default constructor-child class1");
        System.out.println("Testcase1 is executing...");
    }
    void testcase1() {
        start_browser();
        close_browser();
        open_excel();
    }
}
