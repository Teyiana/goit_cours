package module_7;

import java.util.Arrays;

public class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}

class DoubleSpaceCleaner{
    public String clean(String phrase){
        phrase = phrase.trim();
        if (phrase.length() <= 1) return phrase;
        char[] chars = phrase.toCharArray();
        char[] result = new char[chars.length];
        result[0] = chars[0];
        int index = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ' ' && chars[i - 1] == chars[i]) {
                continue;
            }
            result[index] = chars[i];
            index++;
        }
        return new String(Arrays.copyOf(result, index));
    }
}
