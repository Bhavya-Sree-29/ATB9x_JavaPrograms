package Oct.ex_30102024;

public class Lab079 {
    public static void main(String[] args) {
        //2d array creation
        int[][] a = new int[3][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;

        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;

        a[2][0] = 7;
        a[2][1] = 8;
        a[2][2] = 9;

        for(int r=0;r<a.length;r++)
        {
            for(int c=0;c<a[r].length;c++)
            {
                System.out.print(a[r][c]); //or
                //System.out.print(a[r][c] +" ");
            }
            System.out.println();
        }

    }
}
