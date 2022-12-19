package Practice;

import org.w3c.dom.css.CSSUnknownRule;
import org.w3c.dom.ls.LSOutput;

import java.sql.PseudoColumnUsage;

public class KadanesAlgo {
    public static void main(String[] args) {
        //Largest sum contiguous sub array
        int[] array = /*{1,2,-2,-3,5,-2,5,-4,3};*/{-1,-2,-3,-4};
        int cur_sum = 0;
        int max_sum = 0;
        int min_sum = 0;
        for(int i=0; i<array.length; i++){
            cur_sum = cur_sum + array[i];
            min_sum = min_sum + array[i];
            min_sum = Math.min(min_sum, cur_sum);
            max_sum = Math.max(max_sum, cur_sum);
            if(cur_sum<0){
                cur_sum=0;
            }
        }
        //   System.out.println(max_sum);
      //  System.out.println(min_sum);
        int res = Math.max(Math.abs(min_sum), Math.abs(max_sum));
     //   System.out.println(res);
        if(res==Math.abs(max_sum)){
            System.out.println(max_sum);
        }else{
            System.out.println(min_sum);
        }

    }
}
