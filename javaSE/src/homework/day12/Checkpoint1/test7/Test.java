package homework.day12.Checkpoint1.test7;

public class Test {
    public static void main(String[] args) {
        //创建Imple01对象
        Imple01 inter1 = new Imple01();
        //调用Imple01类的show方法传入String参数
        inter1.show("abc");
        //创建Imple02对象
        Imple02<Integer> inter2 = new Imple02<>();
        //调用Imple02类的show方法传入Integer参数
        inter2.show(5);
    }
}
