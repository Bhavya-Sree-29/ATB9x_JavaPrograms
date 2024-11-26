package Nov.ex_05112024;

public class Lab084 {
    public static void main(String[] args) {
        //type-2 creation of class
        //obj-1
        Doggy d1 = new Doggy();
        d1.name = "Neapolitan Mastiff";
        d1.age = 5 ;
        d1.color = "Black";
        d1.size = "Small";
        System.out.println("Dog1 information:");
        d1.doggy_info();
        System.out.println();

        //obj-2
        Doggy d2 = new Doggy();
        d2.name = "Blacky";
        d2.age =3 ;
        d2.color = "Black";
        d2.size = "Medium";
        System.out.println("Dog2 information:");
        d2.doggy_info();
        System.out.println();

        //obj-3
        Doggy d3 = new Doggy();
        d3.name = "Mastiff";
        d3.age =4 ;
        d3.color = "White";
        d3.size = "large ";
        System.out.println("Dog3 information:");
        d3.doggy_info();
        System.out.println();

        //obj-4
        Doggy d4 = new Doggy();
        d4.name = "oreo";
        d4.age = 6;
        d4.color = "Brown";
        d4.size = "Small";
        System.out.println("Dog4 information:");
        d4.doggy_info();
        System.out.println();

        //obj-5
        Doggy d5 = new Doggy();
        d5.name = "Tommy";
        d5.age =5;
        d5.color = "white";
        d5.size = "large ";
        System.out.println("Dog5 information:");
        d5.doggy_info();
        System.out.println();
    }
}
class Doggy{
    String name;
    int age;
    String color;
    String size;

    public void doggy_info(){
        System.out.println("Name : " +this.name);
        System.out.println("Age : " +this.age);
        System.out.println("Color : " +this.color);
        System.out.println("Size : " +this.size);
    }
}
