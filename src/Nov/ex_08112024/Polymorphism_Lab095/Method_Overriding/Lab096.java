package Nov.ex_08112024.Polymorphism_Lab095.Method_Overriding;

import org.w3c.dom.ls.LSOutput;

public class Lab096 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.home();
    }

}
class Father{
    void home(){
        System.out.println("3BHK");
    }
}
class Son extends Father{
    @Override
    void home(){
        System.out.println("2BHK");
    }
}
