package module_12;

import java.util.Date;

public class Solution1 {

    public static void main(String[] args) throws InterruptedException {
        new Thread(Solution1::oneSecondLoop).start();
        new Thread(Solution1::fiveSecondLoop).start();
    }

    private static void oneSecondLoop() {
        while (true) {
            try {
                Date current = new Date();
                Thread.sleep(1000L);
                System.out.println(current);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    private static void fiveSecondLoop() {
        while (true) {
            try {
                Thread.sleep(5000L);
                System.out.println("Минуло 5 секунд");
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
