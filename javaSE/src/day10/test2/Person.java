package day10.test2;

public class Person {

    String name="凤姐";


    public void eat(){

        String str="七寸";

        //筷子
        //局部内部类 ：定义在方法中的类。
        class Chopstick{
            public void use(){
                System.out.println(name);
                System.out.println(str);
            }
        }
        Chopstick chopstick=new Chopstick();
        chopstick.use();
    }
}
