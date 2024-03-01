package module_12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution2 {
    public final String FIZZ = "fizz";
    public final String BUZZ = "buzz";
    public final String FIZZ_BUZZ = "fizzbuzz";

    private final AtomicInteger current = new AtomicInteger(0);
    private final Queue<String> resultQueue = new LinkedList<>();
    private final AtomicBoolean state = new AtomicBoolean(false);

    public static void main(String[] args) {
        Solution2 app = new Solution2();
        app.run(50);
    }

    private void run(int n) {
        state.set(true);
        new FizzBuzzThread(current, state, this::fizz).start(); //Thread A
        new FizzBuzzThread(current, state, this::buzz).start(); //Thread B
        new FizzBuzzThread(current, state, this::fizzbuzz).start(); //Thread C
        new FizzBuzzThread(current, state, this::asNumber).start(); //for default numbers

        new Thread(this::number).start(); //Thread D

        synchronized (current) {
            for (int i = 1; i <= n; i++) {
                current.incrementAndGet();
                current.notifyAll();
                try {
                    current.wait(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            state.set(false);
            current.notifyAll();
        }
    }

    public void fizz() {
        if (current.get() > 0 && current.get() % 3 == 0 && current.get() % 5 != 0) {
            addToQueue(FIZZ);
        }
    }

    public void buzz() {
        if (current.get() > 0 && current.get() % 3 != 0 && current.get() % 5 == 0) {
            addToQueue(BUZZ);
        }
    }

    public void fizzbuzz() {
        if (current.get() > 0 && current.get() % 3 == 0 && current.get() % 5 == 0) {
            addToQueue(FIZZ_BUZZ);
        }
    }

    public void asNumber() {
        if (current.get() > 0 && current.get() % 3 != 0 && current.get() % 5 != 0) {
            addToQueue(String.valueOf(current.get()));
        }
    }

    public void number() {
        while (state.get()) {
            synchronized (resultQueue) {
                if (!resultQueue.isEmpty()){
                    System.out.println(resultQueue.poll());
                }
            }
        }
    }

    private void addToQueue(String number) {
        synchronized (resultQueue) {
            resultQueue.add(number);
        }
    }
}
