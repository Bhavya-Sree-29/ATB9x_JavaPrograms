package Nov.ex_08112024.Polymorphism_Lab095.Method_Overloading;

public class Lab095 {
    public static void main(String[] args) {
        Math m = new Math();
        System.out.println(m.add(6.5,7.8));
    }
}
class Math{
    int add(int a, int b){
        return a+b;
    }
    float add(float a, float b){
        return a+b;
    }
    void add(int a,int b,int c){
        System.out.println("It doesn't return anything because of void type");
    }
    double add(double a, double b){
        return a+b;
    }
    double add(double a, double b,float c){
        return a+b+c;
    }
}
