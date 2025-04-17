package org.sawaklaudia.graphs;

import org.sawaklaudia.graphs.dfs.Node;

public class Tree {

    /**
     *              0
     *          /      \
     *        /         \
     *      /            \
     *     /              \
     *     1                2
     *   /   \            /  \
     * 3     4         5      6
     * / \   /  \     / \     / \
     * 7  8  9   10  11  12  13  14
     **/
    public static Node tree() {
        var node14 = new Node(null, null, 14);
        var node13 = new Node(null, null, 13);
        var node12 = new Node(null, null, 12);
        var node11 = new Node(null, null, 11);
        var node10 = new Node(null, null, 10);
        var node9 = new Node(null, null, 9);
        var node8 = new Node(null, null, 8);
        var node7 = new Node(null, null, 7);
        var node6 = new Node(node13, node14, 6);
        var node5 = new Node(node11, node12, 5);
        var node4 = new Node(node9, node10, 4);
        var node3 = new Node(node7, node8, 3);
        var node2 = new Node(node5, node6, 2);
        var node1 = new Node(node3, node4, 1);
        return new Node(node1, node2, 0);
    }

    /**
     *        1
     *      /   \
     *    2      3
     *   /         \
     *  4           5
     **/
    public static Node smallTree() {
        var node4 = new Node(null, null, 5);
        var node3 = new Node(null, null, 4);
        var node2 = new Node(null, node4, 3);
        var node1 = new Node(node3, null, 2);
        return new Node(node1, node2, 1);
    }

    /**
     *         1
     *       /   \
     *      2      3
     *     /
     *    4
     *   /
     *  5
     **/
    public static Node rightSideViewTree() {
        var node4 = new Node(null, null, 5);
        var node3 = new Node(node4, null, 4);
        var node2 = new Node(null, null, 3);
        var node1 = new Node(node3, null, 2);
        return new Node(node1, node2, 1);
    }
}
