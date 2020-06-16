import java.util.Arrays;

public class SortArray {
    public static int[] sortArrays(int[] arr){

        // Sorting using a single loop
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                // Swapping the elements.
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                i = 0;
            }
        }

        return arr;
    }


    public static void main (String []args){

         int arr[] = {12,36,84,21,14,50};
        System.out.println("Array to be sorted is" + Arrays.toString(arr));

       int arr1[]= sortArrays(arr);
        System.out.println("sorted array is :" + Arrays.toString(arr1));
    }
}
