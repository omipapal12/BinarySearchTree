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
        //print the BST
        System.out.println("The BST Created with input data(Left-root-right):");
        bst.inorder();
    }
}
