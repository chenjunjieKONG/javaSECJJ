package homework.day15.test9;

public class Test {
    public static void main(String[] args) {
        Num num1=new Num("第一个线程",10);
        Num num2=new Num("第二个线程",5);
        Num num3=new Num("第三个线程",8);
        num1.start();
        num2.start();
        num3.start();
    }
}
