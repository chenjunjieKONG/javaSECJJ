package homework.day15.test3;

public class Runn implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
