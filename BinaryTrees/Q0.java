package BinaryTrees;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q0 {
    static Scanner sc =null;
    public static void main(String[] args) {
        //Level Order Traversal

        //Creating a tree
        //Storing tree in the form of array
        //2i[Left child], 2i+1[right child]
        /*
                    5
                   / \
                  4   6
                 / \   \
                2   3   9
                   /     \
                   1      2

         */

        /*
        5 4 6 2 3 9 1 2
         */
         sc = new Scanner(System.in);
         Node root = createTree();

         inOrderTraversal(root);
        System.out.println();
         preOrderTraversal(root);
        System.out.println();
         postOrderTraversal(root);

    }
    public static void inOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+ " ");
        inOrderTraversal(root.right);

    }
    public static void preOrderTraversal(Node root){
        if(root==null) return;

        System.out.print(root.data+ " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    public static void postOrderTraversal(Node root){
        if(root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");

    }
    public static Node createTree(){
        Node root = null;
        System.out.println("Enter root node: ");
        int value = sc.nextInt();
        if(value==-1) return null;
        root = new Node(value);
        System.out.println("Print the left of "+ value);
        root.left = createTree();

        System.out.println("Print the right of "+value);
        root.right=createTree();

        return root;
    }




}

class Node{
    Node left;
    Node right;
    int data;

    public Node(int data){
        this.data = data;
    }

}
