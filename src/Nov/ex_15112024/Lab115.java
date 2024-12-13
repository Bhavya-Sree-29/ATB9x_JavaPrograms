package Nov.ex_15112024;

public class Lab115 {
    public static void main(String[] args) {
        //primitive datatype to Wrapper class

        int a =10;
        Integer b = a; //Boxing concept-->>int to Integer

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int res = b.intValue();
        System.out.println(res);

        Integer a2 = 20;
        int value = a2; //Unboxing concept -->>Integer to int
        System.out.println(value);

    }
}
