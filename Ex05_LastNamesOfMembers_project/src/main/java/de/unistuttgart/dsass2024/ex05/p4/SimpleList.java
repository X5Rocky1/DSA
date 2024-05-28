package de.unistuttgart.dsass2024.ex05.p4;

import java.util.ArrayList;
import java.util.List;

/**
 * Do not modify this class
 */
public class SimpleList<T extends Comparable<T>> implements ISimpleList<T> {
    private final List<T> list;

    public SimpleList() {
        this.list = new ArrayList<T>();
    }

    @Override
    public void append(final T element) {
        if (element == null) {
            throw new IllegalArgumentException("element is null");
        }
        this.list.add(element);
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public T get(final int index) {
        return this.list.get(index);
    }

    @Override
    public void swap(final int firstElementIndex, final int secondElementIndex) {
        final T tmp = this.list.get(firstElementIndex);
        this.list.set(firstElementIndex, list.get(secondElementIndex));
        this.list.set(secondElementIndex, tmp);
    }
    
    @Override
    public boolean contains(final T element) {
        return this.list.contains(element);
    }

}