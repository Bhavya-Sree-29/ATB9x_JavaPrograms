package Nov.ex_05112024;

public class StudentsATB {
    String name;
    int age;
    long phone_number;
    int batch_no;
    boolean isMale;
    String address;
    boolean is_fees_paid;

    void study(){
        //no return type no parameters
    }
    void eat(int a){
        //no return type with parameters
        System.out.println("eating");
    }
    int walk(){
        //return type no parameters
        return 10;
    }
    int walk2(int a){
        //return type with parameters
        return 20;
    }
}
