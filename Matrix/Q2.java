package Matrix;

public class Q2 {
    public static void main(String[] args) {
        //Find median in a row wise sorted matrix
        int[][] matrix = new int[3][3];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = (2*i+1)+j-1;
            }
        }

        display(matrix);
        System.out.println();
        int[] arr = {2,14,32,4,22,3,43,5};
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();





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
