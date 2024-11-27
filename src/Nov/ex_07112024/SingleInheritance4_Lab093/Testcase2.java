package Nov.ex_07112024.SingleInheritance4_Lab093;

public class Testcase2 extends Common_test{
    Testcase2() {
        System.out.println("Default constructor-child class2");
        System.out.println("Testcase2 is executing...");
    }
    void testcase2() {
        start_browser();
        close_browser();
        open_excel();
    }
}
