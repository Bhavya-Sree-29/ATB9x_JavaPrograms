package Nov.ex_05112024;

public class Lab083 {
    public static void main(String[] args) {
        //type-1 creation of class
        Dog d1 = new Dog();
        d1.name = "Neapolitan Mastiff";
        d1.age = 5;
        d1.color = "Black";
        d1.size = "Small";
        System.out.println( d1.name);
        System.out.println(d1.age);
        System.out.println(d1.color);
        System.out.println(d1.size);
        d1.sleep();

        Dog d2 = new Dog();
        d2.name = "Blacky";
        d2.age = 3;
        d2.color = "Black";
        d2.size = "Medium";
        System.out.println( d2.name);
        System.out.println(d2.age);
        System.out.println(d2.color);
        System.out.println(d2.size);
        d2.eat();

        Dog d3 = new Dog();
        d3.name = "Mastiff";
        d3.age = 4;
        d3.color = "white";
        d3.size = "large";
        System.out.println( d3.name);
        System.out.println(d3.age);
        System.out.println(d3.color);
        System.out.println(d3.size);
        d3.shout(10);

        Dog d4 = new Dog();
        d4.name = "oreo";
        d4.age = 6;
        d4.color = "brown";
        d4.size = "Small";
        System.out.println( d4.name);
        System.out.println(d4.age);
        System.out.println(d4.color);
        System.out.println(d4.size);
        d4.sleep();

        Dog d5 = new Dog();
        d5.name = "Tommy";
        d5.age = 5;
        d5.color = "white";
        d5.size = "large";
        System.out.println( d5.name);
        System.out.println(d5.age);
        System.out.println(d5.color);
        System.out.println(d5.size);
        d5.sleep();
    }
}
