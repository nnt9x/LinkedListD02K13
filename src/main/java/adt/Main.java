package adt;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Double> linkedList = new DoublyLinkedListImpl<>();
        linkedList.addFirst(1.4);
        linkedList.addFirst(1.5);
        linkedList.display();

        DoublyLinkedList<String> linkedList1 = new DoublyLinkedListImpl<>();
        linkedList1.addFirst("Abc");
        linkedList1.addFirst("hello");
        linkedList1.display();
    }
}
