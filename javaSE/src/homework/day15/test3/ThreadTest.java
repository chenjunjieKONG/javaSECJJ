package homework.day15.test3;

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("这是主线程");
        Child child=new Child("小明");
        child.start();
    }
}
