package Oct.ex_30102024;

public class Lab077 {
    public static void main(String[] args) {
       //arrays exception
        int[] a = new int[-1];
        System.out.println(a); //NegativeArraySizeException

        int[] a1 = new int[5];
        System.out.println(a1[10]);//ArrayIndexOutOfBoundsException

    }
}
