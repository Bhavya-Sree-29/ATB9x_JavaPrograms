package Nov.ex_06112024;

class Car2{
    String name;
    String model;
    int year;

    //Parameterized Constructor
    Car2(String name,String model,int year){
        System.out.println("Parameterized Constructor:");
        this.name = name;
        this.model = model;
        this.year = year;
    }
}
public class Lab087 {
    public static void main(String[] args) {
        Car2 c2 = new Car2("Bhavya","Tesla",2015);
        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println(c2.year);

        Car2 c3 = new Car2("Akhil","Nano",2013);
        System.out.println(c3.name);
        System.out.println(c3.model);
        System.out.println(c3.year);
    }
}
