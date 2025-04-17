package org.sawaklaudia.graphs.bfs;

import org.sawaklaudia.graphs.Graph;
import org.sawaklaudia.graphs.Tree;
import org.sawaklaudia.graphs.dfs.Node;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class BFS {

    public static void main(String[] args) {
        System.out.println("tree");
        bfs(Tree.tree());
        System.out.println("\ngraph");
        bfs(Graph.graph());
    }

    public static void bfs(Node node) {
        Queue<Node> queue = new ArrayDeque<>();
        Set<Node> visited = new HashSet<>();
        queue.offer(node);
        bfs(queue, visited);
    }

    private static void bfs(Queue<Node> queue, Set<Node> visited) {
        while (!queue.isEmpty()) {
            Node first = queue.poll();
            System.out.print(first.getValue() + " -> ");
            if (first.getLeft() != null) {
                if (!visited.contains(first.getLeft())) {
                    visited.add(first.getLeft());
                    queue.offer(first.getLeft());
                }
            }
            if (first.getRight() != null) {
                if (!visited.contains(first.getRight())) {
                    visited.add(first.getRight());
                    queue.offer(first.getRight());
                }
            }
        }
    }
}
