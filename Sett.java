import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class Sett {
    public static void main(String[] args) {
        //In this file I will try to practice the basic operation on set
        //Set is a data structure which posses hte unique values only

        Set<Integer> set = new HashSet<Integer>();
        for(int i=1; i<100; i*=5){
            set.add(i);
            System.out.println(i+ " is added to the set");
        }
        System.out.println(set);
        set.add(1);
        System.out.println(set);
        set.add(3);
        System.out.println(set);
        set.remove(Integer.valueOf(5));
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        Set<Integer> set1= new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set1);
        set.addAll(set1);
        System.out.println(set);
        set.addAll(set);
        System.out.println(set);
        set1.clear();
        System.out.println(set1);




    }
}
