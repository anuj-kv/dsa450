package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int res = search(arr,2,0,arr.length-1);
        System.out.println(res);
    }
    public static int search(int[] arr, int target, int s, int e) {
        if(s>e){
            return -1;
        }
        int mid =s+(e-s)/2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return search(arr, target, s, mid - 1);
        }
        return search(arr, target, mid+1, e);
    }
}
