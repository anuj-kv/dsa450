package Practice;

public class MatrixQ0 {
    public static void main(String[] args) {
        //Spiral traversal on a Matrix
        //Lets make a matrix using for loop
        int[][] matrix = new int[5][5];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]=(i*4)+(j*2)-2;
            }
        }

        display(matrix);
        System.out.println();

        spiralTraversal(matrix);

    }

    public static void spiralTraversal(int[][] matrix){
        int sr=0, er=matrix.length-1, sc=0, ec=matrix[0].length-1, dir=-1, ele=0;
        while(ele<matrix.length*matrix[0].length){
            dir= (dir+1)%4;
            if(dir==0){
                for(int i=sc; i<=ec; i++){
                    System.out.print(matrix[sr][i]+" ");
                    ele++;
                }
                sr++;
            }
            else if(dir==1){
                for(int i=sr; i<=er; i++){
                    System.out.print(matrix[i][ec]+" ");
                    ele++;
                }
                ec--;
            } else if (dir==2) {
            for(int i=ec; i>=sc; i--){
                System.out.print(matrix[er][i]+" ");
                ele++;
            }
            er--;
            } else {
                for(int i=er; i>=sr; i--){
                    System.out.print(matrix[i][sc]+" ");
                    ele++;
                }
                sc++;
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
