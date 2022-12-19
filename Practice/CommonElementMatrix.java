package Practice;

import java.util.HashSet;
import java.util.Set;

public class CommonElementMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,1,4,8},{3,7,8,5,1},{8,7,7,3,1},{8,1,2,7,9}};
        function(matrix);
    }


    public static void function(int[][] matrix){
        Set<Integer> set = new HashSet<Integer>();
        for(int k=0; k<matrix[0].length; k++){
            int count = 0;
            for(int i=1; i<matrix.length; i++){
                for(int j=0; j<matrix[i].length; j++){
                    if(matrix[0][k]==matrix[i][j]){
                        count++;
                    }
                }
            }
            if(count==matrix.length-1){
                set.add(matrix[0][k]);
            }
        }

        System.out.println(set);
    }

}
