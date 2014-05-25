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
        binarySearchTree.insertNode(rootNode, new Node(11));


        //The height of a tree is equal to 1 + the height of its largest subtree.
        System.out.println("The height of the tree = " + binarySearchTree.treeHeight(rootNode));

        Node lowestCommonAncestor = binarySearchTree.findLowestCommonAncestor(rootNode,1, 4);
        int lca = (lowestCommonAncestor == null) ? -1 : lowestCommonAncestor.value;


        System.out.println("Lowest Common Ancestor of 1 and 4 = " + lca);


        //preOrderTraversal.
        binarySearchTree.preOrderTraversal(rootNode);


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
