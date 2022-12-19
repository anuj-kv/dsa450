package Practice;

public class MaxSizeRectangle {
    public static void main(String[] args) {
         int[][] matrix = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        display(matrix);
        System.out.println();
        System.out.println();


    }


    public static void display(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
