package de.unistuttgart.dsass2024.ex06.p3;

public class Edge<E> implements IEdge<E> {
    private final int source;
    private final int destination;
    private final double weight;

    /**
     * Initializes a directed edge from node source to node dest with the given weight.
     *
     * @param source the tail (source) node
     * @param dest   the head (destination) node
     * @param weight the weight of the directed edge
     * @throws java.lang.IndexOutOfBoundsException if either v or w is a negative integer
     * @throws IllegalArgumentException            if weight is NaN
     */
    public Edge(int source, int dest, double weight) {
        if (source < 0)
            throw new IndexOutOfBoundsException("source node's name must be a non-negative integer");
        if (dest < 0)
            throw new IndexOutOfBoundsException("destination node's name must be a non-negative integer");
        if (Double.isNaN(weight))
            throw new IllegalArgumentException("Weight is NaN");
        this.source = source;
        this.destination = dest;
        this.weight = weight;
    }

    @Override
    public int getSource() {
        return source;
    }

    @Override
    public int getDestination() {
        return destination;
    }

    @Override
    public double getWeight() {
        return weight;
    }



    @Override
    public String toString() {
        return String.format("(%d --> %d [%s])", getSource(), getDestination());
    }
}