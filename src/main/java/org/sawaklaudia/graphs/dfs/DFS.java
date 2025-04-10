package org.sawaklaudia.graphs.dfs;

import java.util.HashSet;
import java.util.Set;

public class DFS {

    public void dfs(Node node) {
        Set<Node> visited = new HashSet<>();
        dfs(node, visited);
    }

    private void dfs(Node node, Set<Node> visited) {
        System.out.print(node.getValue() + " -> ");

        if (node.getLeft() != null && !visited.contains(node.getLeft())) {
            visited.add(node.getLeft());
            dfs(node.getLeft(), visited);
        }
        if (node.getRight() != null && !visited.contains(node.getRight())) {
            visited.add(node.getRight());
            dfs(node.getRight(), visited);
        }
    }
}
