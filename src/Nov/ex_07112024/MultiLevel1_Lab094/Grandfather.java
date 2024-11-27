package Nov.ex_07112024.MultiLevel1_Lab094;

public class Grandfather {
    void home(){
        System.out.println("1BHK");
    }
    void gf(){
        System.out.println("Grandfather");
    }
}
class Father extends Grandfather{
    void home(){
        System.out.println("2BHK");
    }
    void extra(){
        System.out.println("extra");
    }
    void f(){
        System.out.println("Father");
    }
}
class Child extends Father{
    void home(){
        System.out.println("3BHK");
    }
    void c(){
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.home();
        c.gf();
        c.f();
        c.c();

        Father f = new Father();
        f.home();
        f.f();
        f.extra();
        f.gf();

        Grandfather gf = new Grandfather();
        gf.home();
        gf.gf();
    }
}

