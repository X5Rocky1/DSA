package de.unistuttgart.dsass2024.ex05.p4;

/**
 * A simple list interface
 * 
 * @param <T> The type of list element. Has to implement Comparable<T>.
 */
public interface ISimpleList<T extends Comparable<T>> {

    /**
     * Returns the size of the list
     * 
     * @return Size of the list
     */
    public int size();

    /**
     * Appends an element to the end of the list
     * 
     * @param element Element to be appended
     * @throws IllegalArgumentException if element is null.
     */
    public void append(final T element);

    /**
     * Returns the element at the specified position
     * 
     * @param index Index of the element (starting from 0).
     * @throws IndexOutOfBoundsException if the given index is out of range.
     */
    public T get(final int index);

    /**
     * Swaps the specified elements
     * 
     * @param firstElementIndex  The index of the first element
     * 
     * @param secondElementIndex The index of the second element
     * 
     * @throws IndexOutOfBounds if the given indices are out of range
     */
    public void swap(final int firstElementIndex, final int secondElementIndex);

    /**
     * Checks whether the SimpleList contains an element.
     * 
     * @param element element to check.
     * @return true if list contains element else false.
     */
    public boolean contains(final T element);

}