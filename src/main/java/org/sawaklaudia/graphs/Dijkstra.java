package org.sawaklaudia.graphs;

import org.sawaklaudia.graphs.dfs.ContactsList;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {

    public static void main(String[] args) {
        System.out.println("GRAPH: ");
        ContactsList.displayMatrix(directedGraph());
        System.out.println("\nDIJKSTRA: ");
        ContactsList.displayMatrix(dijkstra(directedGraph()));
    }

    /**
     * (10)
     * 0 ----------> 4
     * | \            ^
     * (5)  |  \  (45)     |  (25)
     * |   \_______,  |
     * v           \  |
     * 1 --> 2 -----> 3
     * (20)   (1)
     */
    public static int[][] directedGraph() {
        int n = 5;
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = 0;
            }
        }
        graph[0][1] = 5;
        graph[0][3] = 45;
        graph[0][4] = 10;
        graph[1][2] = 20;
        graph[2][3] = 1;
        graph[3][4] = 25;
        return graph;
    }

    public static int[][] dijkstra(int[][] graph) {
        int[][] helper = new int[graph.length][2];
        helper[0][0] = 0;
        helper[0][1] = 0;
        for (int i = 1; i < helper.length; i++) {
            helper[i][0] = 999;
            helper[i][1] = -1;
        }

        List<Integer> unvisited = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            unvisited.add((i));
        }

        while (!unvisited.isEmpty()) {
            Integer vertex = findMinCostIndex(unvisited, helper);

            for (int i = 0; i < graph[0].length; i++) {
                if (graph[vertex][i] != 0 && unvisited.contains(i)) {
                    int cost = graph[vertex][i] + helper[vertex][0];
                    int actual = helper[i][0];
                    if (actual > cost) {
                        helper[i][0] = cost;
                        helper[i][1] = vertex;
                    }

                }
            }
            unvisited.remove(vertex);
        }
        return helper;
    }

    public static int findMinCostIndex(List<Integer> unvisited, int[][] helper) {
        int minCost = Integer.MAX_VALUE;
        int minCostIndex = -1;
        for (int i = 0; i < unvisited.size(); i++) {
            int index = unvisited.get(i);
            if (helper[index][0] < minCost) {
                minCost = helper[index][0];
                minCostIndex = index;
            }
        }
        return minCostIndex;
    }
}
