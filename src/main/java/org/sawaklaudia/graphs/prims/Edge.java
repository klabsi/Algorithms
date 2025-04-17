package org.sawaklaudia.graphs.prims;

import java.util.Objects;

public class Edge implements Comparable<Edge> {

    private int cost;
    private int startingVertex;
    private int endingVertex;

    public Edge(int cost, int startingVertex, int endingVertex) {
        this.cost = cost;
        this.startingVertex = startingVertex;
        this.endingVertex = endingVertex;
    }

    public int getEndingVertex() {
        return endingVertex;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "cost=" + cost +
                ", startingVertex=" + startingVertex +
                ", endingVertex=" + endingVertex +
                '}';
    }

    @Override
    public int compareTo(Edge o) {
        if (this.cost > o.cost) {
            return 1;
        }
        if (this.cost < o.cost) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return cost == edge.cost && startingVertex == edge.startingVertex && endingVertex == edge.endingVertex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, startingVertex, endingVertex);
    }
}
