package Practice;

public class LinkedListScratch {
    public static void main(String[] args) {
        LLNode nhead = new LLNode(10);
        LLNode n1 = new LLNode(20);
        LLNode n2 = new LLNode(30);
        LLNode n3 = new LLNode(40);

        nhead.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        printLL(nhead);
        System.out.println();
        LLNode p = insertNode1(33,nhead,0);
        printLL(p);
        System.out.println();
       /* deleteNode(3,head);
        printLL(head);*/



    }
    public static void printLL(LLNode node){
        LLNode cur = node;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        //System.out.print(node.data+" ");
    }

    public static LLNode deleteNode(int position ,LLNode head){
        LLNode prev = head;
        if(position==0){
            head = head.next;
            return head;
        }

        for(int i=0; i<position-1; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
    public static LLNode insertNode1(int data, LLNode head, int position) {
        LLNode toAdd = new LLNode(data);
        LLNode prev = head;
        if(position==0) {
            System.out.println("we are here ");
            toAdd.next = head;
            System.out.println("we are here");
            head = toAdd;
            System.out.println( "we are here as well");
            printLL(head);
            System.out.println();
            return head;
        } else {
            System.out.println("we are not supposed to be here");
            for (int i = 0; i < position - 1; i++) {
                prev = prev.next;
            }
            toAdd.next = prev.next;
            prev.next = toAdd;
        }
        return head;
    }
}


class LLNode{
    int data;
    LLNode next;
    public LLNode(int data){
        this.data=data;
        this.next = null;
    }
}
