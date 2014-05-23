package com.test;

public class BinarySearchTree {

    private Node root;

    BinarySearchTree() {
        root = null;
    }

    public void setRoot(Node node) {
        root = node;
    }


    public void insertNode(Node root, Node newNode) {

        if (root == null || newNode == null) return;

        if (root.value > newNode.value) {
            if (root.leftNode == null) {
                root.leftNode = newNode;

            } else {
                insertNode(root.leftNode, newNode);
            }
        } else if (root.value < newNode.value) {

            if (root.rightNode == null) {
                root.rightNode = newNode;
            } else {
                insertNode(root.rightNode, newNode);
            }
        }
    }



    public Node findNode(Node root, int value) {

        if (root == null) return null;

        if (root.value == value) {
            return root;
        }

        if (root.value > value) {
           return findNode(root.leftNode, value);
        } else if (root.value < value) {
           return findNode(root.rightNode, value);
        }


        return root;

    }



}
