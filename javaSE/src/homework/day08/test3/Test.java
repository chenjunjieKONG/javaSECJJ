package homework.day08.test3;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财", 2, 60);
        dog.eat();
        dog.lookHome();
        System.out.println("-------------");
        Cat cat = new Cat("波斯猫", 2, 1000);
        cat.eat();
        cat.catchMouse();
    }
}
