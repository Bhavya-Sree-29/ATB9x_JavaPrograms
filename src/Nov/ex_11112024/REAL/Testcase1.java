package Nov.ex_11112024.REAL;

public class Testcase1  extends BaseClass{
    public Testcase1(){
        super();// Super is a Parent Constructor - Once we call Super() - Means it calls Parent
        // this - current Object
        System.out.println("DC-->>Testcase1");
    }
    public void StartTestcase(){
        openbrowser();
        openbrowser("Chrome");
        closebroswer();
    }

    //method overriding

    @Override
    public void setBrowser(String browser){
        System.out.println("own logic");
        super.setBrowser(browser);
    }

    @Override
    public String toString(){
        return "Testcase1()";
    }


}
