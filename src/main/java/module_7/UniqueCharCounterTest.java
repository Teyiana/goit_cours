package module_7;

import java.util.Arrays;

public class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
class UniqueCharCounter{
    public int count(String phrase) {
//
//        char[] charPhrase = phrase.toCharArray();
//        int[] chars = new int[1 + Character.MAX_VALUE];
//        for (char c : charPhrase) {
//            chars[c]++;
//        }
//        int count = 0;
//        for (int repeats : chars) {
//            if (repeats > 0) {
//                count++;
//            }
//        }
//        return count;

        char[] charPhrase = phrase.toCharArray();
        int uniqCount = 0;
        for (int i = 0; i < charPhrase.length ; i++) {
            int repeatCount = 0;
            for (int j = 0; j < charPhrase.length; j++) {
                if(charPhrase[i] == charPhrase[j] && i != j) {
                    repeatCount++;
                }
            }
            if (repeatCount > 0) {
                uniqCount++;
            }
        }
        return uniqCount;
    }
}
