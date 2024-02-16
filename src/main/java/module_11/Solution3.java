package module_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution3 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 0, 9, 3, 6, 2, 4, 7, 5, 8);

        Stream<String> numberStream = number.stream().sorted().map(i -> "" + i);
        System.out.println(numberStream.reduce((s1, s2) -> s1 + ", " + s2).get());
    }
}
