package module_7;

import static java.lang.Character.*;

public class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}

class DigitText {
    public boolean detect(String text) {
        char[] chars = text.toCharArray();

        for (char aChar : chars) {
            if (aChar != ' ' && !Character.isDigit(aChar)) {
                return false;
            }
        }
        return true;
    }
}
