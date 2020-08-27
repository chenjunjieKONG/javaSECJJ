package homework.day12.Checkpoint1.test1;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        //创建Collection对象
        Collection<String> str = new ArrayList<>();
        //往集合中添加对象元素
        str.add("小李");
        str.add("小王");
        str.add("小新");
        str.add("小天");
        System.out.println(str);//输出集合内容
        //获取集合大小
        System.out.println("集合长度：" + str.size());
        //删除元素
        str.remove("小天");
        System.out.println(str);//输出集合内容
        //获取集合大小
        System.out.println("集合长度：" + str.size());
        ((ArrayList<String>) str).remove(0);
        System.out.println(str);
        //获取集合大小
        System.out.println("集合长度：" + str.size());
        str.clear();//清空集合
        System.out.println(str);//输出集合内容

    }
}
