package Array;

public class Q1 {
    public static void main(String[] args) {
        //reverse an array
    int[] arr = {4,3,1,5,14,1,2,44,53,4};
   /* public void swap(int i, int j){

        }*/
        System.out.println(arr.length);
        int j = 9;
    for(int i=0; i<5; i++){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j--;
    }

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }


    }
}
