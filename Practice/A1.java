package Practice;

import java.util.Arrays;

public class A1 {
    public static void main(String[] args) {
        //Move all the negative element on the one side
      /*int[] arr = {-1,-4,5,3,-5,2,-2,4,-5,2,3,-12};
        Arrays.sort(arr);
        for(int e:arr){
            System.out.print(e+" ");
        }*/
        int[] arr = {-1,-4,5,3,-5,2,-2,4,-5,2,3,-12};
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            if(arr[low]<0){
                low++;
            } else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int e: arr){
            System.out.print(e+" ");
        }

    }
}

