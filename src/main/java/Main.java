public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFirst(10);
        doublyLinkedList.display();
        doublyLinkedList.addFirst(20);
        doublyLinkedList.display(); // 20<->10
        doublyLinkedList.addLast(30);
        doublyLinkedList.display(); // 20 10 30
        doublyLinkedList.add(40, 1);
        doublyLinkedList.display(); // 20 40 10 30
        doublyLinkedList.add(50, 2);
        doublyLinkedList.display(); // 20 40 50 10 30
        doublyLinkedList.add(60, 0);
        doublyLinkedList.display();
        doublyLinkedList.add(70, 6);
        doublyLinkedList.display(); // 60< -- >20< -- >40< -- >50< -- >10< -- >30< -- >70< -- >NULL

        doublyLinkedList.removeFirst();
        doublyLinkedList.display();
        doublyLinkedList.removeFirst();
        doublyLinkedList.display();

        doublyLinkedList.removeLast();
        doublyLinkedList.display(); // 40< -- >50< -- >10< -- >30< -- >NULL

        doublyLinkedList.remove(2);
        doublyLinkedList.display();

        System.out.println();

    }
}
