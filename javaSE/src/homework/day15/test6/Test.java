package homework.day15.test6;

public class Test {
    public static void main(String[] args) {
        Physical physical=new Physical();
        new Thread(physical,"实体店").start();
        new Thread(physical,"官网").start();
    }
}
