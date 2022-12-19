import java.util.ArrayDeque;

public class Dequeee {
    public static void main(String[] args) {
        //In this file I will try to do some basic operations on the deque


        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        for(int i=7; i<634; i+=37){
            dq.addFirst(i);
            System.out.println(i+" is added to the deque");
        }


        System.out.println(dq);
        System.out.println(dq.size());
    }
}
