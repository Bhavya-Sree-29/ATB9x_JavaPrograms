package Nov.ex_06112024;

class Car1{
    String name;
    String model;
    int year;
    Car1(){
        name = "Unknown";
        model = "XYZ";
        year = 0;
        System.out.println("Default Constructor:");
    }
}
public class Lab086 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);
    }

}
