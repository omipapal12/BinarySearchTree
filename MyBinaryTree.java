package com.bridgelabz;

public class MyBinaryTree {
    public static void main(String[] args)
    {
        //create a BST object
        BinarySearchTree bst = new BinarySearchTree();
        //insert data into BST
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        bst.insert(22);
        bst.insert(40);
        bst.insert(11);
        bst.insert(3);
        bst.insert(16);
        bst.insert(60);
        bst.insert(95);
        bst.insert(65);
        bst.insert(63);
        bst.insert(67);
        //print the BST
        System.out.println("The BST Created with input data(Left-root-right): ");
        bst.inorder();
        boolean ret_val = bst.search (63);
        System.out.println("\nKey 63 found in BST: " + ret_val );
    }
}


