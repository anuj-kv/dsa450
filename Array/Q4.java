package Array;

public class Q4 {
    public static void main(String[] args) {
        //given an array which consists of only 0, 1 and 2. Sort the array without using any sorting array.
        //dutch flag algorithm
        int[] arr = {1,0,2,2,0,0,1,2,1,2,0,0,1,2,0,1,1,2,0,1,2};
        int j = 0;
        int k = 0;
        int l = arr.length-1;

            while(k<=l) {
                if (arr[k] == 2) {
                    int temp = arr[k];
                    arr[k] = arr[l];
                    arr[l] = temp;
                    l--;
                }
                if (arr[k] == 0) {
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                    k++;
                    j++;
                }

                if (arr[k] == 1) {
                    k++;
                }
            }

            for(int ele: arr){
                System.out.print(ele+", ");
            }

        }
    }
