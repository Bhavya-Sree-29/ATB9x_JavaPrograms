package Nov.ex_07112024.SingleInheritance3_Lab092;
//refer SingleInheritance4_Lab093 for better understanding.....

public class Common_BaseTest {
    Common_BaseTest(){
        System.out.println("Default constructor-Parent class");
    }
    void start_browser(){
        System.out.println("Browser is starting");
    }
    void close_browser(){
        System.out.println("Browser is closing");
    }
    void open_excel(){
        System.out.println("Excel is opening");
    }
}
class Testcase extends Common_BaseTest {
    Testcase() {
        System.out.println("Default constructor-child class");
        System.out.println("Testcase1 is executing");
        start_browser();
        close_browser();
        open_excel();
    }


    public static void main(String[] args) {
        Testcase t = new Testcase();
        t.start_browser();
        t.close_browser();
        t.open_excel();

    }
}
