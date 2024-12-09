package Nov.ex_11112024.REAL;

public class BaseClass {
    //Step-1:
    //All the instance variables are "private" in nature as per the encapsulation concept)

    private String browser;

    //Step-2:
    //To access the instance variables, need to use getter & setter methods

    public String  getBrowser(){
        return browser;
    }

    public void setBrowser(String browser){
        this.browser=browser;
    }

    //we can create Default & parameterized constructors
    BaseClass(){
        System.out.println("DC-->>BaseClass");
    }
    BaseClass(String b){
        System.out.println("PC-->>BaseClass");
    }

    //we can create method overloading

    void openbrowser(){
        System.out.println("Opening Browser...!");

        // for selenium, we use the below code:
        //        Webdriver driver = new ChromeDriver();
        //        driver.get("url");
    }
    void openbrowser(String browsername){
        System.out.println("Open Browser "+browsername);
    }

    void closebroswer(){
        System.out.println("Closing Browser...!");
    }

}
