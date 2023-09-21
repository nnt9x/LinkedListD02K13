public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFirst(10);
        doublyLinkedList.display();
        doublyLinkedList.addFirst(20);
        doublyLinkedList.display(); // 20<->10
        doublyLinkedList.addLast(30);
        doublyLinkedList.display();

        System.out.println();

    }
}
