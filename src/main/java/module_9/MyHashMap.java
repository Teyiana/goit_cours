package module_9;

public class MyHashMap<K, V> {
    private int size = 0;
    private static final int DEFAULT_LENGTH = 16;
    private Node<K, V>[] table = new Node[DEFAULT_LENGTH];

    public MyHashMap() {
    }

    public void put(K key, V value) {
        Node<K, V> node = getNode(key);
        if (node != null) {
            node.value = value;
        } else {
            int index = getIndex(key);
            table[index] = new Node<>(key, value, table[index]);
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void remove(K key) {
        Node<K, V> node = getNode(key);
        if (node != null) {
            Node<K, V> prev = node.previous;
            if (prev != null) {
                prev.next = node.next;
            } else {
                table[getIndex(key)] = node.next;
            }
            size--;
        }
    }

    public void clear() {
        table = new Node[DEFAULT_LENGTH];
        size = 0;
    }

    public V get(K key) {
        Node<K, V> node = getNode(key);
        return node == null ? null : node.value;
    }

    public Node<K, V> getNode(K key) {
        if (key == null) throw new IllegalArgumentException("Key should be not null!");
        Node<K, V> n = table[getIndex(key)];
        while (n != null && !n.key.equals(key)) {
            n = n.next;
        }
        return n;
    }

    private int getIndex(K key) {
        int hash = key.hashCode();
        return Math.abs(hash) % table.length;
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
        Node<K, V> previous;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
            if (next != null) {
                next.previous = this;
            }
        }
    }
}
