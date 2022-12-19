package Practice;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Comparator;

public class c4 {
    public static void main(String[] args) {
        //Max Min element in array
        int[] array = {1,3,41,34,10,2,3,0,-100};

       String res =  minmaxElement(array);
        System.out.println(res);
    }
    public static String minmaxElement(int[] array){
        int min = array[0];
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
            if(array[i]>max){
                max = array[i];
            }
        }
        return min +" and "+ max ;
    }
}
