package homework.day15.test7;

public class Cat implements Runnable {
    private static Integer num=80;
    private static Object object=new Object();
    @Override
    public void run() {
        while (true){
            synchronized (object){
                if(num<=0){
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"上车--还剩"+(num-1)+"个座位");
                num--;
            }
        }
    }
}
