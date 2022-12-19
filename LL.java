import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        //In this file I will try to operate a LinkedList
        /*
        LL implements two interfaces list and queue
         */

        //Without further ado lets just create an object of the LinkedList class

        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i=8; i<999; i*=4){
            ll.add(i);
            System.out.println(i+" is added of the given Linkedlist");
        }

        System.out.println(ll);

        ll.offer(343);
        System.out.println(ll);
        ll.offerFirst(3);
        System.out.println(ll);

    }
}
