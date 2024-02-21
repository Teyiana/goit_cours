package module_11;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Solution5 {
    public static void main(String[] args) {

        Stream<String> first = Stream.of("Oleh", "Ivan", "Pavlo", "Maria", "Petro");
        Stream<String> second = Stream.of("23", "32", "18", "26", "42", "19", "20");

        Stream<String> result = zip(first, second);
        result.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        AtomicInteger index = new AtomicInteger(1);
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        return Stream.iterate(firstIterator.next(), (o) -> hasNext(index, firstIterator, secondIterator),
                (o) -> getNext(index, firstIterator, secondIterator));
    }

    private static <T> boolean hasNext(AtomicInteger index, Iterator<T> firstIterator, Iterator<T> secondIterator) {
        return index.get() % 2 == 0 ? firstIterator.hasNext() : secondIterator.hasNext();
    }

    private static <T> T getNext(AtomicInteger index, Iterator<T> firstIterator, Iterator<T> secondIterator) {
        return index.getAndIncrement() % 2 == 0 ? firstIterator.next() : secondIterator.next();
    }
}
