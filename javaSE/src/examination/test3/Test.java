package examination.test3;

public class Test {
    //定义数量
    static Integer num=100;
    static Object o=new Object();
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        if (num == 0) {
                            break;
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("售出途径："
                                + Thread.currentThread().getName()
                                + "，卖出第" + (101 - num) + "个"
                                + ",剩余" + (--num) + "个");
                    }
                }
            }
        };
        new Thread(runnable,"实体店").start();
        new Thread(runnable,"官网").start();
    }
}
