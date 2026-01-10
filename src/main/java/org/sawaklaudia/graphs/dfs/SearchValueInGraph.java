package org.sawaklaudia.graphs.dfs;

import java.util.HashSet;
import java.util.Set;

public class SearchValueInGraph {

    public static boolean canReach(Node node, int toReach) {
        Set<Node> visited = new HashSet<>();
        return dfs(node, toReach, visited);
    }

    private static boolean dfs(Node node, int toReach, Set<Node> visited) {
        if (node == null) {
            return false;
        }

        if (node.getValue() == toReach) {
            return true;
        }

        visited.add(node);

        if (node.getLeft() != null && !visited.contains(node.getLeft())) {
            if (dfs(node.getLeft(), toReach, visited)) {
                return true;
            }
        }
        if (node.getRight() != null && !visited.contains(node.getRight())) {
            if (dfs(node.getRight(), toReach, visited)) {
                return true;
            }
        }
        return false;
    }
}
