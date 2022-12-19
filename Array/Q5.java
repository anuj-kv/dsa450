package Array;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        //Move all the negative elements to the one side of the array
        int[] arr = {1,3,-4,-3,4,3,55,-1,-2,4,-10};
        //Arrays.sort(arr);
        for(int e: arr){
            System.out.print(e+" ");
        }
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;
            }
        }
        System.out.println();
        for(int e: arr){
            System.out.print(e+" ");
        }

    }
}
