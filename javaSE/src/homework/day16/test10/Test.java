package homework.day16.test10;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        new Thread(() -> {
            synchronized (person) {
                for (int i = 0; i < 100; i++) {
                    try {
                        if (i % 2 == 1) {
                            person.setName("小明");
                            person.setGander("男");
                        } else {
                            person.setName("小花");
                            person.setGander("女");
                        }
                        person.notify();
                        person.wait();
                    } catch (Exception e) {
                        System.out.println("不允许出现人妖");
                        System.exit(1);
                    }
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                synchronized (person) {
                    System.out.println("姓名："+person.getName() + ",性别：" + person.getGander());
                    try {
                        person.notify();
                        person.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
