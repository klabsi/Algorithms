package org.sawaklaudia.graphs.prims;

import org.sawaklaudia.graphs.Graph;

import java.util.*;

public class MinimumSpanningTree {

    public static void main(String[] args) {
        List<Edge> edgeList = mst(Graph.notDirectedGraph());
        for (Edge edge : edgeList) {
            System.out.println(edge);
        }
    }

    public static List<Edge> mst(int[][] graph) {
        int startingVertex = 0;
        List<Edge> edgeList = new ArrayList<>();
        Set<Integer> visitedVertices = new HashSet<>();
        visitedVertices.add(startingVertex);

        Queue<Edge> edgeQueue = new PriorityQueue<>();
        addEdgeToQueue(graph, startingVertex, edgeQueue, visitedVertices);

        while (!edgeQueue.isEmpty()) {
            Edge minCostEdge = edgeQueue.poll();
            if(!visitedVertices.contains(minCostEdge.getEndingVertex())) {
                edgeList.add(minCostEdge);
                visitedVertices.add(minCostEdge.getEndingVertex());
                addEdgeToQueue(graph, minCostEdge.getEndingVertex(), edgeQueue, visitedVertices);
            }
        }
        return edgeList;
    }

    private static void addEdgeToQueue(int[][] graph, int startingVertex, Queue<Edge> edgeQueue, Set<Integer> visited) {
        for (int column = 0; column < graph[0].length; column++) {
            if (graph[startingVertex][column] != 0 && !visited.contains(column)) {
                edgeQueue.add(new Edge(graph[startingVertex][column], startingVertex, column));
            }
        }
    }
}
