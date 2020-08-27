package day10.test2;

public class Car {
    String name="大黄蜂";
    String length="5";
    public void run1(){

    }

    //类中方法外 成员内部类
    class Engine{
        String string="";

        public void run(){
            name="大众";
            System.out.println("车："+name);
            System.out.println("车的长度："+length);
        }
    }
}
