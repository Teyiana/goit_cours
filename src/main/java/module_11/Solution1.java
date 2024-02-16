package module_11;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Petro");
        names.add("Oleh");
        names.add("Ivan");
        names.add("Pavlo");
        names.add("Olha");
        names.add("Taras");
        names.add("Olena");

        System.out.println(checkOdd(names));
    }

    private static String checkOdd(List<String> names) {
        AtomicInteger index = new AtomicInteger();
        String result = names
                .stream()
                .filter((name) -> index.incrementAndGet() % 2 == 1)
                .map(name -> index + ". " + name)
                .reduce((n1, n2) -> n1 + ", " + n2)
                .orElse("");

        return result;
    }
}
