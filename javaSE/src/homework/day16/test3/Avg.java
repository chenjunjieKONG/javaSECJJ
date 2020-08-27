package homework.day16.test3;

import java.util.Random;
import java.util.concurrent.Callable;


public class Avg implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += random.nextInt(100) + 1;
        }
        int avg = sum / 10;
        return avg;
    }
}
