package Nov.ex_06112024;
import java.util.*;

//parameterized constructor-->>taking input from the user
class Car3{
    String name;
    String model;
    int year;

    Car3(String name,String model,int year){
        System.out.println("parameterized constructor:");
        this.name = name;
        this.model = model;
        this.year = year;
    }
}
public class Lab088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter model:");
        String model = sc.next();
        System.out.println("Enter year:");
        int year = sc.nextInt();

        Car3 c3 = new Car3(name,model,year);
        System.out.println(c3.name);
        System.out.println(c3.model);
        System.out.println(c3.year );
    }
}
