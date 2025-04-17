package org.sawaklaudia.graphs.dfs;

import org.sawaklaudia.graphs.Tree;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevelsInBinaryTree {

    public static void main(String[] args) {
        List<Double> avrValues = calcAverageOfLevels(Tree.smallTree());
        System.out.println(avrValues);
    }

    public static List<Double> calcAverageOfLevels(Node node) {
        List<Double> avrValues = new ArrayList<>();
        avrValues.add((double) node.getValue());
        List<Integer> sums = new ArrayList<>();
        List<Integer> numOfNodesOfLevel = new ArrayList<>();
        dfs(node, 0, sums, numOfNodesOfLevel);

        for (int i = 0; i < sums.size(); i++) {
            avrValues.add(i + 1, sums.get(i) / (double) numOfNodesOfLevel.get(i));
        }
        return avrValues;
    }

    private static void dfs(Node node, int level, List<Integer> sums, List<Integer> numOfNodesOfLevel) {
        if (node.getLeft() != null) {
            if (level == sums.size()) {
                sums.add(node.getLeft().getValue());
                numOfNodesOfLevel.add(1);
            } else {
                sums.set(level, sums.get(level) + node.getLeft().getValue());
                numOfNodesOfLevel.set(level, numOfNodesOfLevel.get(level) + 1);
            }
            dfs(node.getLeft(), level + 1, sums, numOfNodesOfLevel);
        }

        if (node.getRight() != null) {
            if (level == sums.size()) {
                sums.add(node.getRight().getValue());
                numOfNodesOfLevel.add(1);
            } else {
                sums.set(level, sums.get(level) + node.getRight().getValue());
                numOfNodesOfLevel.set(level, numOfNodesOfLevel.get(level) + 1);
            }
            dfs(node.getRight(), level + 1, sums, numOfNodesOfLevel);
        }
    }
}
