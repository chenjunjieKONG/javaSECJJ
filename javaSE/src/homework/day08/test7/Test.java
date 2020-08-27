package homework.day08.test7;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("m110", "老王", 10000);
        manager.eat();
        manager.work();
        Cook cook = new Cook("c110", "小王", 6000);
        cook.eat();
        cook.work();
    }
}
