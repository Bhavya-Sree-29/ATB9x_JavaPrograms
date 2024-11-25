package Oct.ex_29102024;

public class Lab073 {
    public static void main(String[] args) {
        //to find max/ min value in an array
        int [] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max_result = max(array);
        System.out.println("Max_value = "+max_result);
        int min_result = min(array);
        System.out.println("Min_value = "+min_result);
    }
    static int max(int[] array)
    {
        int max = array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        return max;
    }

    static int min(int[] array)
    {
        int min = array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        return min;
    }
}
