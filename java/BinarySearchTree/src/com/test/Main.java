package com.test;

public class Main {

    public static void main(String[] args) {


        System.out.println("Start");

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node rootNode = new Node(5);
        binarySearchTree.setRoot(rootNode);

        binarySearchTree.insertNode(rootNode, new Node(3));
        binarySearchTree.insertNode(rootNode, new Node(10));
        binarySearchTree.insertNode(rootNode, new Node(1));
        binarySearchTree.insertNode(rootNode, new Node(4));
        binarySearchTree.insertNode(rootNode, new Node(7));
        binarySearchTree.insertNode(rootNode, new Node(12));


        Node findNode = binarySearchTree.findNode(rootNode, 12);
        if (findNode != null) {

            System.out.println("BST Node Found " + findNode.value);
        } else {
            System.out.println("BST Node not found.");
        }


        findNode = binarySearchTree.findNode(rootNode, 29);
        if (findNode != null) {
            System.out.println("BST Node Found " + findNode.value);
        } else {
            System.out.println("BST Node not found.");
        }


        System.out.println("End.");



    }
}
