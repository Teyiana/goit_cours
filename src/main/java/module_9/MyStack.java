package module_9;

import java.lang.constant.Constable;
import java.util.NoSuchElementException;

public class MyStack<T> extends MyLinkedList<T> {

    public T peek() {
        if (size() <= 0) return null;
        return get(size() - 1);
    }

    public T pop() {
        if (size() <= 0) throw new NoSuchElementException();
        return remove(size() - 1);
    }

    public void push(T value) {
        add(value);
    }
}
