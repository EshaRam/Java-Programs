
//Write a program to find the largest number in a given array.

import java.util.Arrays;

public class Largest {

    public static int largestNumber(int arr[]) {

        //int arr[] = {12, 84, 28, 38, 14};

        // Arrays.sort(arr);
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (large < arr[1]) {
                large = arr[i];
            }
        }
        return large;
    }
}
