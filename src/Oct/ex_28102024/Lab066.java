package Oct.ex_28102024;

public class Lab066 {
    public static void main(String[] args) {
        //substring function
        String str = "I'm in Hyderabad";
        String sub_str = str.substring(7,10);
        System.out.println("Sub_string : "+sub_str);

        //concatenation function
        String s1 = "Bhavya";
        String s2 = s1.concat(" Sree");
        System.out.println("Concatenation : "+s2);

        //Splitting strings
        //Eg1:
        String fruits = "Apple, Banana, Cherry";
        String[] split_fruits = fruits.split(","); //delimiter=","
        System.out.println("splitting strings1:");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        //Eg2:
        String fruits2 = "Apple| Banana| Cherry";
        String[] split_fruits2 = fruits2.split("|"); //delimiter=","
        System.out.println("splitting strings2:");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        //charAt()
        String s= "Akhil";
        System.out.println("CharAt() : "+s.charAt(3));
        System.out.println("CharAt() : "+s.charAt(4));

        //trim()
        String ch = " Bhavya ";
        System.out.println("Trim():"+ch.trim());

        //indexOf() & lastindexOf()
        String a = "Bhavya";
        System.out.println("indexOf():"+a.indexOf("v"));
        System.out.println("indexOf():"+a.indexOf("B"));
        System.out.println("LastIndexOf():"+a.lastIndexOf("a"));

        //contains
        String b = "BhavyaSree";
        System.out.println("Contains():"+b.contains("ya"));
        System.out.println("Contains():"+b.contains("xyz"));

        //replace() & replaceAll()
        String c = "BhavyaSree";
        System.out.println("replace():"+c.replace("e","i"));
        System.out.println("replace():"+c.replace("z","i"));
        System.out.println("replaceAll():"+c.replaceAll("e","i"));
        //replaceAll
        String z = "Hello123 World456!";
        System.out.println("replaceAll():"+ z.replaceAll("\\d+","")); // "\\d+"-->> removes all integers from the string



        //startsWith() & endsWith()
        String d = "Akhil";
        System.out.println("startsWith():"+d.startsWith("Akh"));
        System.out.println("endsWith():"+d.endsWith("il"));


    }
}
