package Practice;

public class LinkedListPractice20Dec {
    public static void main(String[] args) {
        //Create a linked list and reverse it
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);
        Node n5 = new Node(60);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printLL(head);
        System.out.println();
       // reverseTheLinkedList(head);
        System.out.println();
        Node rev = reverseTheLinkedListRecursive(head);
        printLL(rev);

    }
    public static Node reverseTheLinkedListRecursive(Node head){
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }

        Node res = reverseTheLinkedListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
    public static void reverseTheLinkedList(Node head){
        if(head==null){
            System.out.println("linkedList is empty");
        }
        if(head.next==null){
            printLL(head);
            return;
        }
        Node pre = null;
        Node cur = head;
        while(cur!=null){
            Node temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head = pre;
       printLL(head);


    }
    public static void printLL(Node head){
        if(head==null){
          System.out.print("Given Linked List empty");
        return;
        }
        while(head!=null){
            System.out.print(head.data+" => ");
            head=head.next;
        }
    }
}




class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
