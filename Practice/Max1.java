package Practice;

public class Max1 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
        int i=0;
        /*int j=matrix[i].length-1;*/
        int row = -1;
        int max_1 = 0;
        int cur_max_1 =0;
        for(int j=matrix[i].length-1;j>=0;){
            if(matrix[i][j]==1 /*&& matrix[i][j-1]==0*/) {
                cur_max_1++;
                row = i+1;
                if(max_1<cur_max_1){
                    max_1= cur_max_1;
                }
                if(j>0){
                    j--;
                }
                else {
                    break;
                }
            }
            else if(matrix[i][j]==0){
                cur_max_1=0;
                if(i<3) {
                    i++;
                }else{
                    break;
                }
              if(j<3) {
                  j= matrix[i].length-max_1;
              }
            }/* else if (matrix[i][j]==1) {
                j--;
                cur_max_1++;
                max_1=Math.max(max_1,cur_max_1);
            }*/
        }


        System.out.println(row);


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
