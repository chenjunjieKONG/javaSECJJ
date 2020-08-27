package homework.day15.test3;

public class Child extends Thread {
    public Child(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+i);
        }
    }
}
