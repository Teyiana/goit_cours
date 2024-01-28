package module_7;
import java.util.Arrays;

public class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class  DigitExtracter{
    public int[] extract(String text){
        int i = 0;
        char[] chars = text.toCharArray();
        int[] digits = new int[chars.length];
        for (char c : chars){
            if(c >= '0' && c <= '9'){
                int n = c - '0';
                digits[i] = n;
                i++;
            }
        }
        return Arrays.copyOf(digits, i);
    }
}
