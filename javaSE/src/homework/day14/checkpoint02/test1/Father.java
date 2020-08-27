package homework.day14.checkpoint02.test1;

public class Father {
    public void eat() throws ToothPainException {
        System.out.println("吃到一个石子");
        throw new ToothPainException("牙疼");
    }
    public void drink() throws ToothPainException {
        System.out.println("喝什么都没有问题");
    }
}
