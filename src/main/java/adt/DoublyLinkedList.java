package adt;

public interface DoublyLinkedList<T> {
    void addFirst(T data);

    void addLast(T data);

    void add(T data, int position);

    void removeFirst();

    void removeLast();

    void remove(int position);

    void display();
}
