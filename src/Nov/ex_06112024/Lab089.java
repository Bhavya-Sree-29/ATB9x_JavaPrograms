package Nov.ex_06112024;

//Constructor overloading
class Car4{
    String model;
    int year;

    Car4(String model,int year){
        System.out.println("Parameterized Constructor-1:");
        this.model = model;
        this.year = year;
    }

    Car4(String model){
        System.out.println("Parameterized Constructor-2:");
        this.model = model;
    }
    void display()
    {
        System.out.println("Car4 Details-->> "+this.model + "-->>" + this.year);
    }

}
public class Lab089 {
    public static void main(String[] args) {
        Car4 c4 = new Car4("TATA_NANO");
        System.out.println(c4.model);
        c4.display();

        Car4 c5 = new Car4("Benz",2008);
        System.out.println(c5.model);
        System.out.println(c5.year);
        c5.display();


    }
}
