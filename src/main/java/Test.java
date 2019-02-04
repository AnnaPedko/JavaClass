import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] arr = { 1,6,2,9,0,10,-1 };
        //bubbleSort(arr);
        selectedSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int [] array)
    {
        for( int j = array.length - 1; j > 0 ; --j )
            for( int i = 0; i < j; ++i )
            {
                if( array[i] > array[i + 1] )
                swapElements(array, i, i + 1);
            }
    }

    public static void swapElements( int [] array, int a, int b)
    {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void selectedSort(int [] arr)
    {

        for( int i = 0 ; i < arr.length; ++i )
        {
            swapElements(arr, i , findMin(arr, i));
        }
    }

    public static int findMin(int [] arr, int k)
    {
        int minElement = arr[k];
        int index = k;
        for( int i = k; i < arr.length - 1; ++i )
        {
            if( minElement > arr[i + 1] ) {
                minElement = arr[i + 1];
                index = i + 1;
            }
        }

        return index;

    }
}
