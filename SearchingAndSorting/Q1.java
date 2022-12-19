package SearchingAndSorting;

public class Q1 {
    public static void main(String[] args) {
        //Find a fixed point (Value equal to index) in a given array
        int[] arr = {1,2,3,41,1,32,2,4,9,9,9};
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==i){
                System.out.println(i);
            }
        }
    }
}
