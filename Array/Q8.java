package Array;

public class Q8 {
    public static void main(String[] args) {
        //Find the largest sum contiguous subarray.

        //Brute force solution ---O(n2)

        int[] arr = {1,2,3,-2,3,-2,-4,2,4,5,-1,9,-5,6,-3};
        int max_sum = 0;
        int cur_sum = 0;
       /* for(int i = 0; i<arr.length; i++){
            cur_sum = arr[i];
            if (cur_sum>max_sum){
                max_sum=cur_sum;
            }
            for(int j = i+1; j<arr.length; j++){
                cur_sum=cur_sum+arr[j];
                if(cur_sum>max_sum){
                    max_sum=cur_sum;
                }
            }
            cur_sum=0;
        }
        System.out.println(max_sum);*/

        //Kadane's Algorithm

        for(int i = 0; i<arr.length; i++){
            cur_sum=cur_sum+arr[i];
            if(cur_sum>max_sum){
                max_sum=cur_sum;
            }
            if(cur_sum<0){
                cur_sum=0;
            }
        }
        System.out.println(max_sum);
    }
}
