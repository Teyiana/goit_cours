package module_12;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class FizzBuzzThread extends Thread {

    private final AtomicInteger current;
    private final AtomicBoolean state;

    public FizzBuzzThread(AtomicInteger current, AtomicBoolean state, Runnable target) {
        super(target);
        this.current = current;
        this.state = state;
    }


    @Override
    public void run() {
        while (state.get()) {
            synchronized (current) {
                try {
                    super.run();
                    current.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
