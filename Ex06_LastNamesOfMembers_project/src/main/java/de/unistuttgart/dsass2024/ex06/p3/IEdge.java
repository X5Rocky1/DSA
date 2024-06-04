package de.unistuttgart.dsass2024.ex06.p3;

public interface IEdge<E> {

  /**
   * @return the tail (source) node of the edge
   */
  public int getSource();

  /**
   * @return the head (destination) node of the directed edge
   */
  public int getDestination();

  /**
   * @return the weight of the directed edge
   */
  public double getWeight();


}