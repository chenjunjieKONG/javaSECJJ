package homework.day12.Checkpoint2.test4;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //定义ArrayList
        ArrayList<People> list = new ArrayList<>();
        People people1 = new People("小明", 18, 1.70);
        People people2 = new People("小龙", 20, 1.78);
        People people3 = new People("小天", 19, 1.80);
        People people4 = new People("小新", 20, 1.50);
        People people5 = new People("小林", 17, 1.77);
        //添加5个学生
        list.add(people1);
        list.add(people2);
        list.add(people3);
        list.add(people4);
        list.add(people5);
        //获取迭代器
        Iterator<People> it = list.iterator();
        while (it.hasNext()) {//循环判断是否有下一个人
            People p = it.next();//使用next方法获取学生对象
            int age = p.getAge() + 2;//将学生的年龄加2岁,在使用setAge方法设置回去
            p.setAge(age);
        }
        // 使用增强for获取每个学生,打印每个学生的信息
        for (People people : list) {
            System.out.println("姓名：" + people.getName() + ",年龄：" + people.getAge() + "岁,身高：" + people.getHeight() + "米");
        }
    }
}
