package Practice;

import java.util.PriorityQueue;

public class searchRowColumnSorted {
    public static void main(String[] args) {
        int[][] matrix = {{10, 15, 22, 28}, {11, 16, 23, 30}, {12, 18, 25, 32}, {14, 20, 27, 34}};
        display(matrix);
        int target = 14;
        System.out.println();
        String res = search(matrix, target);
        System.out.println(res);
        System.out.println();
        printInSortedOrder(matrix);
        System.out.println();
        System.out.println();
        kthSmallest(matrix, 4);
    }
    public static void kthSmallest(int[][] matrix, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                pq.offer(matrix[i][j]);
            }
        }
        while(k>1){
            k--;
            pq.poll();
        }
        System.out.println(pq.peek());

    }
    public static void printInSortedOrder(int[][] matrix){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                pq.offer(matrix[i][j]);
            }
        }

        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }
    public static String search(int[][] matrix, int target) {
        int i = 0;
        for (int j = matrix[0].length-1; j >= 0; ) {
            if (matrix[i][j] == target) {
                return (i + 1) + " row and " + (j + 1) + " column";
            } else if (matrix[i][j] > target) {
                if (j > 0) {
                    j--;
                } else {
                    return "not  found";
                }
            } else {
                if (i < 3) {
                    i++;
                } else {
                    return "not found";
                }
            }
        }
        return "not found";
    }


    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


