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

    public void add(int data, int position) {
        if (position < 0 || position > size) {
            throw new RuntimeException("Không hợp lệ!");
        } else if (position == 0) {
            addFirst(data);
        } else if (position == size) {
            addLast(data);
        } else {
            // Tìm ra Node ở vị trí position -1
            Node previousNode = head;
            for (int i = 0; i < position - 1; i++) {
                previousNode = previousNode.getNext();
            }
            // Đã có previous -> lấy vị trí position
            Node currentNode = previousNode.getNext();

            // Tao node moi
            Node tmp = new Node(data);
            previousNode.setNext(tmp);
            tmp.setPrevious(previousNode);

            tmp.setNext(currentNode);
            currentNode.setPrevious(tmp);
            // Tang size
            size++;
        }
    }

    public void removeFirst() {
        if (size == 0) {
            throw new RuntimeException("Danh sách rỗng!");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            // Lớn hơn 1
            // Cần tìm ra next của head hiện tại
            Node next = head.getNext();
            next.setPrevious(null);
            head.setNext(null);

            head = next;

            size--;
        }
    }

    public void removeLast() {
        if (size == 0) {
            throw new RuntimeException("Danh sách rỗng!");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            // Cần tìm ra vị trí node gần cuối và cuối
            // Vi tri gan cuoi: index = size - 2
            Node nearLastNode = head;
            for (int i = 0; i < size - 2; i++) {
                nearLastNode = nearLastNode.getNext();
            }
            Node lastNode = nearLastNode.getNext();

            nearLastNode.setNext(null);
            lastNode.setPrevious(null);

            size--;

        }
    }

    public void remove(int position) {
        if (size == 0) {
            throw new RuntimeException("Danh sách rỗng!");
        }
        if (position == 0) {
            removeFirst();
        } else if (position == size - 1) {
            removeLast();
        } else if (position < 0 || position >= size) {
            throw new RuntimeException("Không hợp lệ!");
        } else {
            // Hợp lệ -> xoá ở giữa
            Node previousNode = head;
            for (int i = 0; i < position - 1; i++) {
                previousNode = previousNode.getNext();
            }
            Node positionNode = previousNode.getNext();

            Node nextNode = positionNode.getNext();

            previousNode.setNext(nextNode);
            nextNode.setPrevious(previousNode);
            positionNode.setNext(null);
            positionNode.setPrevious(null);
            size--;

        }

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
