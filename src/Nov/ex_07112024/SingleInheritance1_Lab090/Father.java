package Nov.ex_07112024.SingleInheritance1_Lab090;

//single inheritance
public class Father {
    int gold_f = 1000;
    void bhk2(){
        System.out.println("2BHK");
    }
}
class Son extends Father {
    void bhk3() {
        System.out.println("3BHK");
        System.out.println(gold_f);
    }

    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.gold_f);
        s.bhk2();
        s.bhk3();
    }
}
