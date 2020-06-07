
//Write a program to find the largest number in a given array.

import java.util.Arrays;

public class Largest {

    public static int largestNumber() {

       int arr[] = {12, 84, 28, 38, 14};

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){

        }
        System.out.println("largest number is: "+arr[arr.length-1]);

        return (arr[arr.length-1]);
    }

}
