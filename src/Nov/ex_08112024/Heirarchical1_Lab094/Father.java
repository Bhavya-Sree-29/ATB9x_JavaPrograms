package Nov.ex_08112024.Heirarchical1_Lab094;

public class Father {
    void home(){
        System.out.println("Father's Home");
    }
}
class Bhavya extends Father{
    void h2(){
        System.out.println("Bhavya's Home");
    }
}
class Sree extends Father{
    void s3(){
        System.out.println("Sree's Home");
    }
}
class Durga extends Father{
    void d4(){
        System.out.println("Durga's Home");
    }

    public static void main(String[] args) {
        Durga d = new Durga();
        d.d4();
        d.home();

        Sree s = new Sree();
        s.s3();
        s.home();

        Bhavya b = new Bhavya();
        b.h2();
        b.home();

        Father f = new Father();
        f.home();
    }
}
