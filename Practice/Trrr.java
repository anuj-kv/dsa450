package Practice;

import java.util.*;

public class Trrr {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
                    15
                   /  \
                  6    7
                 /\     \
                8  9     3
               /\
              1  2
         */
        Node root = createBinaryTree();
        System.out.println("Level Order Traversal");
        levelOrderTraversal(root);
        System.out.println();
        System.out.println("Pre Order Traversal");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("Post Order Traversal");
        postOrderTraversal(root);
        System.out.println();
        System.out.println("In Order Traversal");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("Reverse Level Order Traversal");
        reverseOrderLevelTraversal(root);
        System.out.println();
        System.out.println("Height of the tree is "+ heightOfTree(root));
        System.out.println();
        System.out.println("Left View of the tree");
        printLeftView(root);
        System.out.println();
        System.out.println("Right View of the tree");
        printRightView(root);
    }

    public static void printLeftView(Node root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            list.add(-1);
        }
        utilPrintLeftView(root, list, 0);
        for(int n:list){
            if(n!=-1) {
                System.out.print(n + " ");
            }
        }
    }

    public static void printRightView(Node root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            list.add(-1);
        }
        utilPrintRightView(root, list, 0);
        for(int n:list){
            if(n!=-1) {
                System.out.print(n + " ");
            }
        }
    }

    public static void utilPrintRightView(Node root, ArrayList<Integer> list, int level){
        if(root == null) return;
        if(list.get(level)==-1){
            list.set(level, root.data);
        }
        utilPrintRightView(root.right, list, level+1);
        utilPrintRightView(root.left, list, level+1);

    }
    public static void utilPrintLeftView(Node root, ArrayList<Integer> list, int level){
    if(root == null) return;
    if(list.get(level)==-1){
        list.set(level, root.data);
    }
    utilPrintLeftView(root.left, list, level+1);
    utilPrintLeftView(root.right, list, level+1);

    }
    public static int heightOfTree(Node root){
        int lheight =0;
        int rheight =0;
        if(root == null) return 0;
        lheight = heightOfTree(root.left);
        rheight = heightOfTree(root.right);
        if(lheight>rheight){
            return lheight+1;
        }else{
            return rheight+1;
        }
    }
    public static void inOrderTraversal(Node root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    public static void preOrderTraversal(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root){
        if(root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data +" ");
    }

    public static void reverseOrderLevelTraversal(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node cur = q.poll();
            list.add(cur.data);
            if (cur.left != null) {
                q.add(cur.left);
            }
            if (cur.right != null) {
                q.add(cur.right);
            }
        }
        Collections.reverse(list);
        System.out.println(list);

    }
    public static void levelOrderTraversal(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node cur = q.poll();
            if(cur == null){
                if(q.isEmpty()){
                    return;
                }
                q.add(null);
                System.out.println();
            }else{
                System.out.print(cur.data+" ");
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
    }
    public static Node createBinaryTree(){
       Node root = null;
        System.out.println("Enter the root: ");
        int data = sc.nextInt();
        if(data==-1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter the left of "+ root.data);
        root.left = createBinaryTree();
        System.out.println("Enter the right of "+ root.data);
        root.right = createBinaryTree();
       return root;
    }
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
}

