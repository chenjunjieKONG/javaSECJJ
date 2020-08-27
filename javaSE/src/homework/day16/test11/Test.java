package homework.day16.test11;

public class Test {
    static int staff = 100;
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while (true) {
                    synchronized (Object.class) {
                        if (staff <= 0) {
                            break;
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("编号为：" + staff + "的员工 " + Thread.currentThread().getName() + " 入场！");
                        System.out.println("拿到的双色球彩票号码是："+DoubleColorBallUtil.create());
                        count++;
                        staff--;
                    }
                }
                System.out.println(Thread.currentThread().getName()+"入场的员工总共："+count+"位员工");
            }
        };
        new Thread(runnable, "从前门").start();
        new Thread(runnable, "从后门").start();

    }
}
