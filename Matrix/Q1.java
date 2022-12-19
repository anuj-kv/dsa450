package Matrix;

public class Q1 {
    public static void main(String[] args) {
        //Search an element in a matrix
        int[][] matrix = new int[4][4];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]=(j*3)+(4*i)-2;
            }
        }

        String res = search(matrix, -2);
        System.out.println(res);

        System.out.println();
        display(matrix);
        System.out.println();
        System.out.println(search(matrix,19));
    }

    public static String search(int[][] matrix, int ele){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if (matrix[i][j] == ele){
                    return ele+" at "+ (i+1)+"th row and "+(j+1)+"th column";
                }
            }
        }
        return "not found";
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
