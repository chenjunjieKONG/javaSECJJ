package homework.day15.test3;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("这是主线程");
        Runn runn=new Runn();
        Thread thread=new Thread(runn,"小陈");
        thread.start();
    }
}
