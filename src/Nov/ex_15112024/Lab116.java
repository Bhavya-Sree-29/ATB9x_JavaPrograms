package Nov.ex_15112024;

public class Lab116 {
    public static void main(String[] args) {
        //conversion

        String num = "10";

        //String-->>Wrapper(Integer) -->>primitive
        Integer a = Integer.valueOf(num);
        int b = a;//unboxing(wrapper to primitive)

        //String -->> primitive
        int c = Integer.parseInt(num);

        //similarly with other Wrapper datatypes
        Long l = 10l;
        Short s = 23;
        Float f = 23.45f;
        Boolean bb = true;
    }
}
