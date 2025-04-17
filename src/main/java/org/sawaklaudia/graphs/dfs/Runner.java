package org.sawaklaudia.graphs.dfs;

import org.sawaklaudia.graphs.Graph;
import org.sawaklaudia.graphs.Tree;

public class Runner {

    public static void main(String[] args) {
        DFS dfs = new DFS();
        dfs.dfs(Tree.tree());
        System.out.println();
        dfs.dfs(Graph.graph());
    }
}
