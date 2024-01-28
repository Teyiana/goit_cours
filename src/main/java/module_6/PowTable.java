package module_6;

import java.util.Arrays;
public class PowTable {
    public static final int[] POWERS_2 = new int[10];

    static {
        int j = 0;
        for (int i = 1; i <= 10; i++) {
            int result = i * i;
            POWERS_2[j] = result;
            j++;
        }
    }

}


class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
