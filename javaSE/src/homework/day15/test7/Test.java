package homework.day15.test7;

public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat();
        new Thread(cat,"前门").start();
        new Thread(cat,"中门").start();
        new Thread(cat,"后门").start();
    }
}
