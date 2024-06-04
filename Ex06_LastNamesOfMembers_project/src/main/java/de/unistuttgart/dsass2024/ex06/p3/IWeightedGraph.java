package de.unistuttgart.dsass2024.ex06.p3;

import java.util.ArrayList;
import java.util.Iterator;

public interface IWeightedGraph<N, E> extends Iterable<IEdge<E>> {

    /**
     * @return the number of nodes in the weighted graph
     */
    public int numberOfNodes();

    /**
     * @return the number of edges in the weighted graph
     */
    public int numberOfEdges();

    /**
     * Returns an iterator for all edges in the weighted graph.
     *
     * @return an iterator that iterates through all edges in the weighted graph
     */
    public Iterator<IEdge<E>> edgeIterator();

    /**
     * Returns an iterator for all outgoing edges of the given node.
     *
     * @param src the node id, for which to get outgoing edges
     * @return an iterator that iterates through all outgoing edges of the given node
     */
    public Iterator<IEdge<E>> outgoingEdges(int src);

    @Override
    default Iterator<IEdge<E>> iterator() {
        return edgeIterator();
    }

    /**
     * This method reads an edge list and initializes a graph object from it.
     *
     * This method assumes that the nodes in the given edge list are indexed by the
     * natural numbers *including* 0.
     * (This is different from the lecture where nodes are indexed starting from 1!)
     *
     * createFromEdgeList can only be called on an empty graph object.
     *
     * @param list edge list to read
     * @throws UnsupportedOperationException if the graph object already has nodes or edges
     */
    public void createFromEdgeList(ArrayList<Integer> list) throws UnsupportedOperationException;

    /**
     * This method converts the graph object into an edge list.
     *
     * The nodes in the returned edge list are indexed by the natural numbers
     * *including* 0.
     * (This is different from the lecture where nodes are indexed starting from 1!)
     *
     * @return edge list
     */
    public ArrayList<Integer> toEdgeList();

    /**
     * This method reads a node list and initializes a graph object from it.
     *
     * This method assumes that the nodes in the given node list are indexed by the
     * natural numbers *including* 0.
     * (This is different from the lecture where nodes are indexed starting from 1!)
     *
     * createFromNodeList can only be called on an empty graph object.
     *
     * @param list node list to read
     * @throws UnsupportedOperationException if the graph object already has nodes or edges
     */
    public void createFromNodeList(ArrayList<Integer> list) throws UnsupportedOperationException;

    /**
     * This method converts the graph object into a node list.
     *
     * The nodes in the returned node list are indexed by the natural numbers
     * *including* 0.
     * (This is different from the lecture where nodes are indexed starting from 1!)
     *
     * @return node list
     */
    public ArrayList<Integer> toNodeList();
}