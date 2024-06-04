package de.unistuttgart.dsass2024.ex06.p3;

import java.util.ArrayList;
import java.util.Iterator;

public class WeightedGraph<N, E> implements IWeightedGraph<N, E> {

    private int numEdges;
    private ArrayList<ArrayList<IEdge<E>>> adjacencyList;

    /**
     * Initializes an empty graph without nodes or edges.
     */
    public WeightedGraph() {
        this.numEdges = 0;
        this.adjacencyList = new ArrayList<>();
    }

    @Override
    public int numberOfNodes() {
        return this.adjacencyList.size();
    }

    @Override
    public int numberOfEdges() {
        return this.numEdges;
    }

    @Override
    public Iterator<IEdge<E>> edgeIterator() {
        ArrayList<IEdge<E>> edges = new ArrayList<>(numEdges);
        for (ArrayList<IEdge<E>> outgoingEdges : this.adjacencyList) {
            edges.addAll(outgoingEdges);
        }
        return edges.iterator();
    }

    @Override
    public Iterator<IEdge<E>> outgoingEdges(int src) {
        return this.adjacencyList.get(src).iterator();
    }

    public int addNode() {
        this.adjacencyList.add(new ArrayList<>());
        return this.adjacencyList.size() - 1;
    }

    public void addEdge(int src, int dest) {
        if (src < 0 || src >= numberOfNodes() || dest < 0 || dest >= numberOfNodes())
            throw new IllegalArgumentException();
        this.adjacencyList.get(src).add(new Edge<>(src, dest, 0));
        this.numEdges++;
    }

    public void createFromEdgeList(ArrayList<Integer> list) throws UnsupportedOperationException {
    }


    public ArrayList<Integer> toEdgeList() {
    }

    public void createFromNodeList(ArrayList<Integer> list) throws UnsupportedOperationException {
    }

    public ArrayList<Integer> toNodeList(){
    }


}