package org.sawaklaudia.graphs.dfs;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

    /**
     * 1
     * /   \
     * 2      3
     * /
     * 4
     * /
     * 5
     **/
    public static Node tree() {
        var node4 = new Node(null, null, 5);
        var node3 = new Node(node4, null, 4);
        var node2 = new Node(null, null, 3);
        var node1 = new Node(node3, null, 2);
        return new Node(node1, node2, 1);
    }

    /**
     * 1
     * /   \
     * 2      3
     * /         \
     * 4           5
     **/
    public static Node secTree() {
        var node4 = new Node(null, null, 5);
        var node3 = new Node(null, null, 4);
        var node2 = new Node(null, node4, 3);
        var node1 = new Node(node3, null, 2);
        return new Node(node1, node2, 1);
    }

    public static void main(String[] args) {
        List<Integer> tree = rightSideView(tree());
        System.out.println("widok z prawej: ");
        for (Integer val : tree) {
            System.out.print(val + " . ");
        }
        List<Integer> secTree = rightSideView(secTree());
        System.out.println("widok z prawej: ");
        for (Integer val : secTree) {
            System.out.print(val + " . ");
        }
    }

    public static List<Integer> rightSideView(Node node) {
        List<Integer> values = new ArrayList<>();
        values.add(node.getValue());
        dfs(node, 1, values);
        return values;
    }

    private static void dfs(Node node, int level, List<Integer> values) {
        if (node.getRight() != null) {
            if (level == values.size()) {
                values.add(node.getRight().getValue());
            }
            dfs(node.getRight(), level + 1, values);
        }
        if (node.getLeft() != null) {
            if (level == values.size()) {
                values.add(node.getLeft().getValue());
            }
            dfs(node.getLeft(), level + 1, values);
        }
    }
}
