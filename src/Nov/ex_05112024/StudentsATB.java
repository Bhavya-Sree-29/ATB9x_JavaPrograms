package Nov.ex_05112024;
//c-->>class
public class StudentsATB {
   //A -->>Attributes or data members or instance variables or fields or member variables
    String name;
    int age;
    long phone_number;
    int batch_no;
    boolean isMale;
    String address;
    boolean is_fees_paid;

    //B-->>Behaviour or member functions or methods
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
