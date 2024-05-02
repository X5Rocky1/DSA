package de.unistuttgart.dsass2024.ex02.p5;

/**
 * This is the interface for your SimpleList.
 * Your class should implement these methods according to their comments.
 *
 * @param <T> The type of list element
 */
public interface ISimpleList<T extends Comparable<T>> {

    /**
     * Returns the size of the list.
     *
     * @return Size of the list
     */
    public int getSize();

    /**
     * Prepends an element at the start of the list.
     * I.e. the new element becomes element 0
     *
     * @param element Element to be appended
     */
    public void prepend(T element);

    /**
     * Returns the element at the specified position.
     *
     * @param index Index of the element (starting from 0)
     * @throws IndexOutOfBounds if the given index is out of range
     */
    public T getElement(int index) throws IndexOutOfBoundsException;

    /**
     * This method sorts your list.
     * It should use Bubble Sort, but not use any access on the list via an index,
     * i.e. it MUST NOT use the method getElement(). It should therefore avoid the problems
     * you stated in "Aufgabe 5 a)".
     */
    public void sort();
}