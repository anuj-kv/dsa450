package Practice;

public class MatrixQ1 {
    public static void main(String[] args) {
        //Search an element in a matrix
        //Lets search an element in an unsorted matrix
        int[][]matrix = new int[3][3];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]=(3*i)+(j*4)-2;
            }
        }

        display(matrix);
        System.out.println();
        System.out.println();
        System.out.println();
        String res = search(matrix, 20);
        System.out.println(res);
        System.out.println();
        System.out.println();
        System.out.println();

        int[][] row_wise_sorted_matrix = {{3,6,9},{10,16,18},{19,20,21}};

        display(row_wise_sorted_matrix);
        System.out.println();
        System.out.println();

        String ress = binarySearch(row_wise_sorted_matrix, 20);
        System.out.println("ghug");
        System.out.println(ress);
    }
    //Binary search time complexity = O(log n)
    public static String binarySearch(int[][] matrix, int target_element){

        int column_length = matrix[0].length;
        int low=0;
        int high=(matrix.length*matrix[0].length)-1;

        while(low<high){
            int mid = (high+low)/2;
            if(matrix[mid/column_length][mid%column_length]==target_element){
                return target_element +" is in "+ ((mid/column_length)+1) +" row and "+ ((mid%column_length)+1) + " column of the given matrix.";
            }else if(target_element < matrix[mid/column_length][mid%column_length]){
                high=mid-1;
            }else if(target_element > matrix[mid/column_length][mid%column_length]){
                low =mid+1;
            }
        }
        return "Search element is not present in the given matrix";
    }
    // time complexity = O(n*m)
    public static void display(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static String search(int[][] matrix, int target_element){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==target_element){
                    return target_element +" is in "+ (i+1) +" row and "+ (j+1) + " column of the given matrix.";
                }
            }
        }
        return "Searched element is not present in the given matrix.";
    }
}
