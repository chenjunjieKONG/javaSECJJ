package homework.day15.test6;

public class Physical implements Runnable {
    private static Integer num = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        int count = 1;
        while (true) {
            synchronized (obj) {
                if (num <= 0) {
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖出" + count + "个,总共剩余" + (--num) + "个");
                count++;
            }
        }
    }
}
