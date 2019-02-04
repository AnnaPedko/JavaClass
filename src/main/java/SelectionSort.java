import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[]ints = {1, 2, 5, 10, 8};
        sort(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void sort(int[]ints)
    {
        for (int i = 0; i < ints.length; ++i)
        {
            for (int j = 0; j < ints.length; ++j)
            {
                if(ints[i] > ints[j])
                {
                    int a = ints[i];
                    ints[i] = ints[j];
                    ints[j] = a;
                }
            }
        }
    }

}
