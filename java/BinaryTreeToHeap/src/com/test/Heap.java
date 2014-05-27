package com.test;

import java.util.Arrays;
import java.util.Comparator;

public class Heap {

    /**
     * heapifyBinaryTree
     * This method will convert a binary tree into an array of nodes, then reassign the child nodes of each node in order
     * to create a  heap based on the binary tree. The heap is represented by a binary tree in heap order.
     *
     * @param root
     * @return
     */
    public static Node heapifyBinaryTree(Node root) {

        // First, get the number of nodes in the binary tree.
        // This is in order to get the size of the node array that we need to create.
        int count = traverse(root, 0, null);
        Node[] nodeArray = new Node[count];

        //Now traverse the binary tree and load into the array.
        traverse(root, 0, nodeArray);

        //Sort the array of nodes based on their values.
        //This will basically give us a heap representation of the data from the binary tree.
        Arrays.sort(nodeArray, new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                return (n1.data < n2.data ? -1 : (n1.data == n2.data ? 0 : 1));
            }
        });


        //reassign child nodes.
        //Now we want to take the child nodes from the heap represented by the array and assign them to the left
        //and right children of each node.
        //This will now give us a binary tree representation of the heap.
        //i.e. we have heapified the original binary tree.

        for (int i = 0; i < count; i++) {
            //These are the positions of the children of a heap when the heap is implemented as an arry.
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;

            nodeArray[i].leftNode = (leftChild >= count) ? null : nodeArray[leftChild];
            nodeArray[i].rightNode = (rightChild >= count) ? null : nodeArray[rightChild];
        }

        return nodeArray[0];

    }


    /**
     * Traverse the binary tree.
     *
     * @param node
     * @param count
     * @param arr
     * @return
     */
    public static int traverse(Node node, int count, Node[] arr) {

        if (node == null) return count;

        if (arr != null) arr[count] = node;

        count++;

        count = traverse(node.leftNode, count, arr);
        count = traverse(node.rightNode, count, arr);

        return count;
    }


}
