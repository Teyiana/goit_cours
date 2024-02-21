package module_11;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Solution4 {
    public static void main(String[] args) { long seed = 0;
        long a = 25214903917L;
        long c = 11L;
        long m = Double.doubleToLongBits(Math.pow(2, 48));

        Stream<Long> result = generateNumbers(a, c, m);
        result.forEach(System.out::println);
    }

    public static Stream<Long> generateNumbers(long a, long c, long m){
        long seed = 0;
        return Stream.iterate(seed, (xn) -> (a * xn + c) % m);
    }
}
