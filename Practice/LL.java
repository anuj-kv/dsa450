package Practice;

public class LL {
    public static void main(String[] args) {
        //Reverse the Linked List
        //Let's first create a LL

        //or Lets just used the LinkedList class from the collection framework
      /*  LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);

        System.out.println(ll);
        Collections.reverse(ll);
        System.out.println();
        System.out.println(ll);*/

        Node1 n1 = new Node1(2);
        n1.next = new Node1(3);
        n1.next.next = new Node1(4);
        n1.next.next.next = null;




    }
}

class Linked {

}
class Node1 {
    Node1 next;
    int data;
    public Node1(int data){
        this.data=data;
    }
}

