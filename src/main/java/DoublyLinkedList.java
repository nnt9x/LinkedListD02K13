public class DoublyLinkedList {
    private Node head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        // Bước 1: tạo node mới
        Node tmp = new Node(data);
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

    public void addLast(int data) {
        if (size == 0) {
            addFirst(data);
            return;
        }
        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        // Đã có phần tử cuối.
        Node tmp = new Node(data);
        last.setNext(tmp);
        tmp.setPrevious(last);
        // Tang size
        size++;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        Node i = head;
        while (i != null) {
            System.out.print(i + "< -- >");
            i = i.getNext();
        }
        System.out.print("NULL\n");
    }
}
