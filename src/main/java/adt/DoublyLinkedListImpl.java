package adt;

public class DoublyLinkedListImpl<T> implements DoublyLinkedList<T> {

    private int size;
    private NodeADT<T> head;

    public DoublyLinkedListImpl() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public void addFirst(T data) {
        // Bước 1: tạo node mới
        NodeADT<T> tmp = new NodeADT<>(data);
        // Bước 2: kiểm tra xem kích thước của linked = 0 -> rỗng
        if (size == 0) {
            head = tmp;
            size++;
            return;
        }
        // Lấy head hiện tại
        head.setPrevious(tmp);
        tmp.setNext(head);

        // Gán head mới cho tmp
        head = tmp;
        // Tăng size + 1
        size++;
    }

    @Override
    public void addLast(T data) {

    }

    @Override
    public void add(T data, int position) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void remove(int position) {

    }

    @Override
    public void display() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        NodeADT<T> i = head;
        while (i != null) {
            System.out.print(i + "< -- >");
            i = i.getNext();
        }
        System.out.print("NULL\n");
    }
}
