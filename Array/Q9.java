package Array;

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        //Minimise the maximum difference between heights

        int[] arr = {10,15,20,5,8,9,19,21,13};
        int k = 3;
        Arrays.sort(arr);
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
        int diff = arr[arr.length-1]-arr[0];

        for(int i = 1; i<arr.length; i++){
          int max =  Math.max(arr[arr.length-1]-k,arr[i-1]+k);
          int min =  Math.min(arr[i]-k,arr[0]+k);
        diff = Math.min(diff, max-min);
        }
        System.out.println(diff);

    }
}
