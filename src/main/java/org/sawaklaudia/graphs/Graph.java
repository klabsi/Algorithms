package org.sawaklaudia.graphs;

import org.sawaklaudia.graphs.dfs.Node;

public class Graph {

    /**
     *             0
     *         /      \
     *        /        \
     *       /          \
     *      /            \
     *     1  _________>  2
     *    /              /  \
     *   3             5     6
     *  / \                /  \
     * 7  8 <-------------     -- 9
     **/
    public static Node graph() {
        var node9 = new Node(null, null, 9);
        var node8 = new Node(null, null, 8);
        var node7 = new Node(null, null, 7);
        var node6 = new Node(null, null, 6);
        var node5 = new Node(node8, node9, 5);
        var node3 = new Node(node7, node8, 3);
        var node2 = new Node(node5, node6, 2);
        var node1 = new Node(node3, node2, 1);
        return new Node(node1, node2, 0);
    }

    /**
     *                  (10)
     *        0 -----------------> 4
     *       |  \                  ^
     *   (5) |   \  (45)          |  (25)
     *       |    \__________,   |
     *       v               \  |
     *       1 ----> 2 ----->  3
     *         (20)      (1)
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

    /**
     *            (4)
     *      1 ------,
     * (9) |       |
     *     |       |
     *     |  (1)  |   (9)
     *     2 ----- 3  -----  4
     *    |       |         |
     *    |       | (2)    | (2)
     *    |       |       |
     *    '-----  5 ----- 0
     *      (10)     (3)
     **/

    public static int[][] notDirectedGraph() {
        int n = 6;
        int[][] graph = new int[n][n];
        graph[0][4] = 2;
        graph[0][5] = 3;
        graph[1][2] = 9;
        graph[1][3] = 4;
        graph[2][1] = 9;
        graph[2][3] = 1;
        graph[2][5] = 10;
        graph[3][1] = 4;
        graph[3][2] = 1;
        graph[3][4] = 9;
        graph[3][5] = 2;
        graph[4][0] = 2;
        graph[4][3] = 9;
        graph[5][0] = 3;
        graph[5][2] = 10;
        graph[5][3] = 2;
        return graph;
    }
}
