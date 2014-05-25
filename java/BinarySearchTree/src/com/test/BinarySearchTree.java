package com.test;

public class BinarySearchTree {

    private Node root;

    BinarySearchTree() {
        root = null;
    }

    public void setRoot(Node node) {
        root = node;
    }


    /**
     * if value < node value, then we insert on the left.
     * if value > node value, then we insert on the right.
     * @param root
     * @param newNode
     */
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


    //The height of a tee is equal to 1 + the height of its largest subtree.

    public int treeHeight(Node n) {

        if (n == null) return 0;

        return 1 + Math.max(treeHeight(n.leftNode), treeHeight(n.rightNode));

    }

    /**
     * In a preorder traversal, we print the left node, followed by the left subtree, then the right subtree.
     * @param n
     */
    void preOrderTraversal(Node n) {

        if (n == null) return;
        System.out.println(n.value);
        preOrderTraversal(n.leftNode);
        preOrderTraversal(n.rightNode);
    }


    public Node findLowestCommonAncestor(Node n, int value1, int value2) {

        if (n == null) return null;

        while (n != null) {

            if (value1 > n.value && value2 > n.value) n = n.rightNode;
            else if (value1 < n.value && value2 < n.value) n = n.leftNode;
            else return n; // we have a convergence. Therefore, we have found the lowest common ancestor.
        }

        return null;

    }



}
