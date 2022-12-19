package Array;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        //Find the Kth maximum and minimum element in an array
        //fist sort the array and then get the number
        int[] arr = {4,34,24,5,33,55,2,4,78232,42,23};
        int k= 3;
        Arrays.sort(arr);
        int kmin = arr[k-1];
        int kmax = arr[arr.length-k];

        for(int element: arr){
            System.out.print(element+", ");
        }
        System.out.println();
        System.out.println(kmin);
        System.out.println(kmax);

    }
}
