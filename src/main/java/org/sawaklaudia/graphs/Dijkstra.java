package org.sawaklaudia.graphs;

import org.sawaklaudia.graphs.dfs.ContactsList;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {

    public static void main(String[] args) {
        System.out.println("GRAPH: ");
        ContactsList.displayMatrix(Graph.directedGraph());
        System.out.println("\nDIJKSTRA: ");
        ContactsList.displayMatrix(dijkstra(Graph.directedGraph()));
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
