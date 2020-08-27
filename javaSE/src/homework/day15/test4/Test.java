package homework.day15.test4;

public class Test {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("播放背景音乐");
                }
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("显示画面");
                }
            }
        };
        Thread thread1=new Thread(runnable1);
        thread1.start();
    }
}
