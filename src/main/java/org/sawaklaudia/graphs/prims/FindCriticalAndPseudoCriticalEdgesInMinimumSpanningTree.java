package org.sawaklaudia.graphs.prims;

import java.util.List;

public class FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree {

    // find mst and cal its cost
    // find all possible paths (by removing one edge and then mst) and calc their cost -> if the cost is equal to first one - save the path
    // return number of edges - those which occur in all paths are critical, the rest are pseudo-critical

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {
                {0,1,1}, {1,2,1}, {2,3,2}, {0,3,2}, {0,4,3}, {3,4,3}, {1,4,6}
        };
        findCriticalAndPseudoCriticalEdges(n, edges);
    }

    public static List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        return null;
    }
}
