package Array;

public class Q2 {
    public static void main(String[] args){
        //Find the maximum and minimum element in an array
        int[] arr = {3,5,2,4,1,5,36,44,32,2};
        int max = arr[0];
         int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }

        for(int element: arr){
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
}
