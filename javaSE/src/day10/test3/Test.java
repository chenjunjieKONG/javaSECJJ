package day10.test3;

public class Test {
    public static void main(String[] args) {
        new Person().swimming();
        //匿名内部类
        //返回一个Eat接口的子实现类，而且没有名字
        Eat ea=new Eat(){
            @Override
            public void eat() {
                System.out.println("吃xxxx");
            }
        };
        ea.eat();

        new Swin(){
            @Override
            public void swimming() {
                System.out.println("狗刨式游泳");
            }
        }.swimming();
    }
}
