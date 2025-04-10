package org.sawaklaudia.graphs.dfs;

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        System.out.println(calcMaxDepth(Runner.tree()));
    }

    public static int calcMaxDepth(Node node) {
        //return dfs(node, 0,0);
        return dfsMax(node, 0);
    }

    private static int dfs(Node node, int level, int maxLevel) {
        if (node.getLeft() != null) {
            if (level > maxLevel) {
                maxLevel = level;
            }
            return dfs(node.getLeft(), level + 1, maxLevel);
        }

        if (node.getRight() != null) {
            if (level > maxLevel) {
                maxLevel = level;
            }
            return dfs(node.getRight(), level + 1, maxLevel);
        }

        return maxLevel;
    }

    private static int dfsMax(Node node, int level) {
        if (node == null) {
            return level;
        }

        int leftDepth = dfsMax(node.getLeft(), level + 1);
        int rightDepth = dfsMax(node.getRight(), level + 1);

        return Math.max(leftDepth, rightDepth);
    }
}
