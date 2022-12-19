package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,5,6,7,8,9};
        int[] arr3 = {32,43};
        //for union, lets just make a set
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("union of the given array is: "+ set);


        //intersection of the arrays
        if(arr1.length<arr2.length){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i=0; i<arr1.length; i++){
                for(int j=0; j<arr2.length; j++){
                    if(arr1[i]==arr2[j]){
                        list.add(arr1[i]);
                    }
                }
            }
            System.out.println();
            System.out.println("Intersection of the given arrays is: "+ list);
        }else{
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i=0; i<arr2.length; i++){
                for(int j=0; j<arr1.length; j++){
                    if(arr2[i]==arr1[j]){
                        list.add(arr2[i]);
                    }
                }
            }
            System.out.println();
            System.out.println("Intersection of the given arrays is: "+ list);
        }

    }
}
