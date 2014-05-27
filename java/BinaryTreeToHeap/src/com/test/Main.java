package com.test;

public class Main {

    public static void main(String[] args) {

        System.out.println("Binary Tree to Heap.");

        //Create Binary Search Tree.
        Node rootNode = new Node(5);

        BinarySearchTree.insertNode(rootNode, new Node(4));
        BinarySearchTree.insertNode(rootNode, new Node(1));
        BinarySearchTree.insertNode(rootNode, new Node(12));
        BinarySearchTree.insertNode(rootNode, new Node(10));

        rootNode = Heap.heapifyBinaryTree(rootNode);

    }
}
