package ru.x5javacourse.hw6.ListCollections;

public interface NewList<E> {
    void add(E element);
    void remove(int index);
    void remove(E item);
    int getSize();
    E getElement (int index);
    void clear();
    void printCollection();
}
