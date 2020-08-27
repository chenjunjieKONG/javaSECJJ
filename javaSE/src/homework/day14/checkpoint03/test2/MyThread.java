package homework.day14.checkpoint03.test2;

import java.util.Random;

public class MyThread extends Thread {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int in = random.nextInt(900) + 100;
            System.out.println(in);
            sum += in;
        }
        System.out.println(sum);
    }
}
