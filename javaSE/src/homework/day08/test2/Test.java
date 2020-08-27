package homework.day08.test2;

public class Test {
    public static void main(String[] args) {
        Coder coder = new Coder("马化腾", 45);
        coder.eat();
        coder.sleep();
        coder.coding();
        System.out.println("----------");
        Teacher teacher = new Teacher("马云", 45);
        teacher.eat();
        teacher.sleep();
        teacher.teach();
    }
}
