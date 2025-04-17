package org.sawaklaudia.graphs.dfs;

import org.sawaklaudia.graphs.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

    public static void main(String[] args) {
        List<Integer> tree = rightSideView(Tree.rightSideViewTree());
        System.out.println("widok z prawej: ");
        for (Integer val : tree) {
            System.out.print(val + " . ");
        }
        List<Integer> secTree = rightSideView(Tree.smallTree());
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
