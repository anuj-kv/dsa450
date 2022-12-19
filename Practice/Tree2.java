package Practice;

import java.io.ObjectStreamException;
import java.util.*;

public class Tree2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Top view, Bottom View, Left View and Right view of the given binary tree
        /*
                     3
                   /  \
                  4    6
                 / \  /  \
                5   7 8   9
               /
              10
         */
        Node root = createTree();
      /*  System.out.println("pre Order traversal");*/
     /*   System.out.println();*/
        System.out.println("left view of the tree");
      //  leftView1(root);
        printLeftView(root);
      /*  System.out.println();
        System.out.println("Right view of the tree");*/
      /*  rightView(root);
        System.out.println();
        System.out.println("Bottom View of the tree");
        bottomView(root);
        System.out.println();
        System.out.println("Top view of the tree");
        topView(root);
        System.out.println();
        System.out.println("Mirror of the Tree");
        mirrorTree(root);
        System.out.println();
        System.out.println("Check if the tree is balanced or not");
        balancedTree(root);
        System.out.println("check if the graph is a tree or not");*/


    }

    public static void printLeftView(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10; i++){
            list.add(-1);
        }
        utilLeftView(root,list,0);
        for(int c:list){
            System.out.print(c+" ");
        }
    }
    public static void utilLeftView(Node root, ArrayList<Integer> list, int level){
        if(root==null){
            return;
        }
        //if(list.get(level)==null){
            list.set(level,root.data);
        //}
        utilLeftView(root.left,list,level+1);
        utilLeftView(root.right,list, level+1);
    }
    public static void leftView1(Node root) {
        System.out.println("left view is running ");
        if (root == null) return;
        System.out.println("still runinf1");
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            //System.out.println(cur.data);
            if (cur == null) {
                if (q.isEmpty()) {
                    break;
                }
                q.add(null);
                System.out.println();
                list.add(99);
                //System.out.println();
            } else {
                System.out.print(cur.data + " ");
                list.add(cur.data);
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
        System.out.println();
        System.out.println(list);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            int re = list.remove(0);
            if (re == 99) {
                System.out.print(list.get(0) + " ");
            }
        }
    }

    public static void leftView(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        //list.add(null);
        q.add(null);
        q.add(root);
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
        int leftHeight = 0;
        int rightHeight = 0;
        if(root==null){
            return 0;
        }
        leftHeight = heightOfTree(root.left);
        rightHeight = heightOfTree(root.right);

        if(leftHeight>rightHeight){
            return leftHeight+1;
        }else{
            return rightHeight+1;
        }
    }
    public static void postOrderTraversal(Node root){
        if(root==null) return;
        preOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data+" ");
    }
    public static void inOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.println(root.data + " ");
        inOrderTraversal(root.right);
    }
    public static ArrayList<Integer> reverseLevelOrderTraversal(Node root){
        if(root==null) return null;
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur = q.poll();
            list.add(cur.data);
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null){
                q.add(cur.right);
            }
                    }
        Collections.reverse(list);
        return list;
    }
    public static void preOrderTraversal(Node root){
        if(root==null) return;
        System.out.println(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void levelOrderTraversal(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(null);
        q.add(root);
        while(!q.isEmpty()){
            if(q.peek()==null){
                if(q.isEmpty()){
                    return;
                }
                q.poll();
                q.add(null);
                System.out.println();
            }else {
                Node cur = q.poll();
                System.out.println(cur.data + " ");
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
    }
    public static Node createTree(){
        Node root = null;
        System.out.println("Enter the root: ");
        int data = sc.nextInt();
        if(data==-1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left of the node "+ root.data);
        root.left = createTree();
        System.out.println("Enter right of the node "+ root.data);
        root.right = createTree();
        return root;
    }
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }

}
