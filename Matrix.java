public class Matrix {
    public static void main(String[] args) {
        //How to represent a matrix
        int[][] matrix = new int[3][3];
        //filling the matrix
        for(int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                matrix[i][j]=i+j*2;
            }
        }

        display(matrix);
        System.out.println();
        transpose(matrix);
        display(matrix);
        System.out.println();
        rotate90degreeClockwise(matrix);
        display(matrix);
        System.out.println();
        spiralTraversal(matrix);
        //display(matrix);

    }
    public static void display(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] matrix){
        //transpose means converting rows into column or vice versa
        for(int i=0; i<matrix.length;i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (i<j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }

    public static void rotate90degreeClockwise(int[][] matrix){
        transpose(matrix);
        for(int i=0; i<matrix.length;i++){
                int low = 0;
                int high = matrix[i].length-1;
                while(low<high){
                    int temp = matrix[i][low];
                    matrix[i][low]=matrix[i][high];
                    matrix[i][high]=temp;
                    low++;
                    high--;
                }
            }
    }

    public static void spiralTraversal(int[][] matrix){

        int sr=0, er=matrix.length-1, sc=0, ec=matrix[0].length-1, dir=-1;
        int ele=0;
        while(ele<=matrix.length*matrix[0].length) {
            dir = (dir + 1) % 4;
            if (dir == 0) {
                for (int i = sc; i <= ec; i++) {
                    System.out.print(matrix[sr][i] + " ");
                    ele++;
                }
                sr++;
            } else if (dir == 1) {
                for (int i = sr; i <= er; i++) {
                    System.out.print(matrix[i][ec] + " ");
                    ele++;
                }
                ec--;
            } else if (dir == 2) {
                for (int i = ec; i >= sc; i--) {
                    System.out.print(matrix[er][i] + " ");
                    ele++;
                }
                er--;
            } else {
                for (int i = er; i >= sr; i--) {
                    System.out.print(matrix[i][sc]+" ");
                    ele++;
                }
                sc++;
            }
        }
    }

}
