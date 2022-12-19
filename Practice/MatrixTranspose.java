package Practice;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]=(j*4)-(i*2)+4;
            }
        }
        display(matrix);
        System.out.println();
        System.out.println();
        System.out.println();
        //transpose(matrix);

        System.out.println();
        System.out.println();
        rotate90dergee_clockwise(matrix);
        display(matrix);
    }
    public static void rotate90dergee_clockwise(int[][] matrix){
        transpose(matrix);
        for(int i=0; i<matrix.length; i++){
            int low =0, high= matrix[i].length-1;
            while(low<high){
                int temp = matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                high--;
                low++;
            }
        }
    }
    public static void transpose(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j]= matrix[j][i];
                    matrix[j][i]= temp;
                }
            }
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
