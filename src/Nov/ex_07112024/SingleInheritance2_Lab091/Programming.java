package Nov.ex_07112024.SingleInheritance2_Lab091;

public class Programming {
    String author;
    int version;

    Programming(){
        author = "ABC";
        version = 0;
        System.out.println("Default Constructor- Parent class");
    }
}
class Python extends Programming{
    Python(){
        System.out.println("Default constructor-Child class");
    }
    public static void main(String[] args){
        Python p = new Python();
        System.out.println(p.author);
        System.out.println(p.version );
    }
}
