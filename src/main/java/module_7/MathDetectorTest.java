package module_7;

public class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}

class MathDetector {
    public boolean isMath(String text) {

        char[] chars = text.toCharArray();
        boolean hasEquals = false;
        boolean hasOperation = false;
        int digits = 0;
        for (char c: chars){
            if (c == '=') {
                hasEquals = true;
            }
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                hasOperation = true;
            }
            if (Character.isDigit(c)) {
                digits++;
            }
        }
        return hasEquals && hasOperation && digits >= 2;
    }
}
