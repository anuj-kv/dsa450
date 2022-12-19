package Array;

public class Q7 {
    public static void main(String[] args) {
        //Write a program to cyclically rotate an array by one.
     int[] arr = {2,4,24,56,55,23,45,32,14,11};
     int last = arr[arr.length-1];
     int i=arr.length-1;
     while(i>0){
         arr[i]=arr[i-1];
         i--;
     }

     arr[0]=last;

     for(int e:arr){
         System.out.print(e+ " ");
     }

    }
}
