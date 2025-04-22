package org.sawaklaudia.graphs.prims;

import java.util.List;

public class MinCostToConnectAllPoints {

    public static void main(String[] args) {
        int[][] points = {
                {0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}
        };
        System.out.println(minCostConnectPoints(points));

        int[][] points2 = {
                {3, 12}, {-2, 5}, {-4, 1}
        };
        System.out.println(minCostConnectPoints(points2));
    }

    public static int minCostConnectPoints(int[][] points) {
        List<Edge> mst = MinimumSpanningTree.mst(createAdjMatrix(points));
        return mst.stream().mapToInt(Edge::getCost).sum();
    }

    private static int[][] createAdjMatrix(int[][] points) {
        int[][] matrix = new int[points.length][points.length];

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                matrix[i][j] = calcDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
                matrix[j][i] = matrix[i][j];
            }
        }
        return matrix;
    }

    private static int calcDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
