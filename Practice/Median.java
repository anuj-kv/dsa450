package Practice;

import java.util.PriorityQueue;

public class Median {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]=(i*5)-(j*2)+3;
            }
        }

        display(matrix);
        System.out.println();
        System.out.println();


        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                pq.offer(matrix[i][j]);
            }
        }

        if(matrix.length*matrix[0].length%2!=0){
            int median = (matrix.length*matrix[0].length)/2;
            while(median>0) {
                pq.poll();
                median--;
            }
            System.out.println(pq.peek());
        }

        if(matrix.length*matrix[0].length%2==0){
            int median = (matrix.length*matrix[0].length)/2;
            while(median>0) {
                pq.poll();
                median--;
            }
            int n = pq.poll();
            int ans = (n+pq.peek())/2;
            System.out.println(ans);
        }

    }



    public static void display(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
