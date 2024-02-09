package module_9;


class MyLinkedList<T> {
    private Node<T> first = new Node<>();
    private Node<T> last = new Node<>();
    private int size = 0;

    public MyLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void add(T value) {
        size++;
        Node<T> lastNode = last.prev;
        Node<T> node = new Node<>(lastNode, value, last);
        lastNode.next = node;
        last.prev = node;
    }

    public T get(int i) {
        return getNode(i).element;
    }

    private Node<T> getNode(int i) {
        if (i >= size || i < 0) throw new IndexOutOfBoundsException(String.format("i = %s, but size = %s", i, size));
        Node<T> f = first.next;
        while (f != last && i > 0) {
            f = f.next;
            i--;
        }
        return f;
    }

    public int size() {
        return size;
    }

    public T remove(int i) {
        Node<T> node = getNode(i);
        Node<T> prev = node.prev;
        Node<T> next = node.next;
        prev.next = next;
        next.prev = prev;
        size--;
        return node.element;
    }

    public void clear() {
        first = last = null;
        size = 0;
    }

    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public Node() {

        }
    }
}