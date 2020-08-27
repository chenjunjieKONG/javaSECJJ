package homework.day15.test5;

public class Child implements Runnable {
    @Override
    public void run() {
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+"，进入山洞了");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"，通过山洞了");
            System.out.println("--------------------");
        }
    }
}
