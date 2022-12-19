package Practice;

import java.util.*;

public class Tree {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // Let create a binary tree
        /*
                     3
                   /  \
                  4    6
                 / \  /  \
                5   7 8   9


         */


       Node root =  createBinaryTree();
        System.out.println("In order Traversal");
       inOrderTraversal(root);
        System.out.println();
 /*       System.out.println("Pre order Traversal");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("Post order Traversal");
        postOrderTraversal(root);
        System.out.println();
        System.out.println("Level Order Traversal");
        ArrayList<Integer> list = levelOrderTraversal(root);
        System.out.println(list);

        System.out.println();
        System.out.println("Reverse Level order Traversal");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println();
        System.out.println("Height of the tree: ");
        System.out.println(heightOfTree(root));*/
        leftView(root);

    }

    public static void leftView(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        //list.add(null);
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            if (q.peek() == null) {
                if (q.isEmpty()) {
                    return;
                } else {
                    list.add(null);
                    q.poll();
                    q.add(null);
                }
            }
            Node cur = q.poll();
            list.add(cur.data);
            if (cur.left != null) {
                q.add(cur.left);
            }
            if (cur.right != null) {
                q.add(cur.right);
            }
        }
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) == null){
                System.out.print(list.get(i+1)+" ");
            }
        }
    }
    public static int heightOfTree(Node root){
        int height = 0;
        int lheight = 0;
        int rheight = 0;
        if(root==null){
            return 0;
        }
        lheight = heightOfTree(root.left);
        rheight = heightOfTree(root.right);

        if(lheight>rheight){
            return lheight+1;
        }
        else
            return rheight+1;
    }

    public static ArrayList<Integer> levelOrderTraversal(Node root){
        if(root == null) return null;
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur = q.poll();
            list.add(cur.data);
           // System.out.print(cur.data+" ");
            if(cur.left != null){
                q.add(cur.left);
            }
            if(cur.right!=null){
                q.add(cur.right);
            }
        }
        return list;
    }




    public static void inOrderTraversal(Node root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    public static void preOrderTraversal(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root){
        if(root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public static Node createBinaryTree(){
        Node root = null;
        System.out.println("Enter the root: ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);

        System.out.println("Left of the "+ root.data);
        root.left = createBinaryTree();
        System.out.println("Right of the "+ root.data);
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
