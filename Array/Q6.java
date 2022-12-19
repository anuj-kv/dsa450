package Array;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        //Find the union and intersection of the two sorted arrays.
        int[] arr1 = {3,4,32,323,24,53,5,7};
        int[] arr2 = {3,1,2,59,5,7,32,4,8};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int m = arr1.length;
        int n = arr2.length;
        int i=0;
        int j =0;


        while(i<m && j<n) {
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+ " ");
                i++;
                j++;
            }

            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            }


            if(arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            }

        }

        while(i<m){
            System.out.print(arr1[i]+" ");
            i++;
        }

        while(j<n){
            System.out.print(arr2[j]+" ");
            j++;
        }

        System.out.println();

       i=0;
       j=0;

        while(i<m && j<n) {
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+ " ");
                i++;
                j++;
            }

            if (arr1[i] < arr2[j]) {
                i++;
            }


            if(arr1[i] > arr2[j]) {
                j++;
            }

        }

    }
}
