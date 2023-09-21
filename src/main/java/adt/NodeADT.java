package adt;

public class NodeADT<T> {
    // generic: tham số hoá kiểu dữ liệu
    private T data;
    private NodeADT<T> next;
    private NodeADT<T> previous;

    public NodeADT(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeADT<T> getNext() {
        return next;
    }

    public void setNext(NodeADT<T> next) {
        this.next = next;
    }

    public NodeADT<T> getPrevious() {
        return previous;
    }

    public void setPrevious(NodeADT<T> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
