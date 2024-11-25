package Oct.ex_30102024;

public class Lab078 {
    public static void main(String[] args) {
        //for loop & for each loop
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        //for loop
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        //for each loop
        for(int i:a)
        {
            System.out.println(i);
        }

        //both "for" & "for each" gives the same output
    }
}
