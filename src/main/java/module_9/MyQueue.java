package module_9;

public class MyQueue<T> extends MyLinkedList<T> {

    public T peek() {
        if (size() <= 0) return null;
        return get(0);
    }

    public T poll() {
        if (size() <= 0) return null;
        return remove(0);
    }

}
