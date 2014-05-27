package com.test;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearchTree {

    public static void insertNode(Node node, Node newNode) {

        if (node == null || newNode == null) return;
        if (node.data > newNode.data) {
            if (node.leftNode == null) {
                node.leftNode = newNode;
            } else {
                insertNode(node.leftNode, newNode);
            }
        } else if (node.data < newNode.data) {
            if (node.rightNode == null) {
                node.rightNode = newNode;
            } else {
                insertNode(node.rightNode, newNode);
            }
        }
    }

}
