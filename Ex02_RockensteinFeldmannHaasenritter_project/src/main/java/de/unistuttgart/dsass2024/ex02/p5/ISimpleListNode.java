package de.unistuttgart.dsass2024.ex02.p5;

/**
 * This interface defines the necessary methods a class must have to work as a node
 * for a linked list.
 * I.e. a class implementing this interface saves its corresponding element of type T,
 * as well as the next node in the list and allows access via the Getter and Setter.
 *
 * @param <T>
 */
public interface ISimpleListNode<T extends Comparable<T>> {

    /**
     *
     * @return the Element T saved in this node
     */
    public T getElement();


    /**
     *
     * @param element the Element to save in this node
     */
    public void setElement(T element);


    /**
     * Returns the node this node points on
     * @return
     */
    public ISimpleListNode<T> getNext();


    /**
     * Sets the node, this node is pointing on
     * @param node the node to point on
     */
    public void setNext(ISimpleListNode<T> node);
}