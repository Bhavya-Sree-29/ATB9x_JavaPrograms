package Nov.ex_18112024;

public class Lab124 {
    public static void main(String[] args) {
        int a=0;
        int c=0;
        try{
            c = 10/a;
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will execute no matter what...");
        }
    }
}
