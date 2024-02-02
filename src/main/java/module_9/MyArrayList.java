package module_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {


    private Object[] data = new Object[10];
    int size = 0;

    public void add(T value) {
        if (size == data.length) {
            Object[] newData = new Object[2 * data.length];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size] = value;
        size++;
    }

    public void remove(int i) {
        if (i < size) {
            int numMoved = size - 1 - i;
            System.arraycopy(data, i + 1, data, i, numMoved);
        }
        size--;
        data[size] = null;
    }

    public T get(int i) {
        return (T) data[i];
    }

    public int size() {
        return size;
    }

    public void clear() {
        data = new Object[10];
        data[size] = 0;
    }
}
