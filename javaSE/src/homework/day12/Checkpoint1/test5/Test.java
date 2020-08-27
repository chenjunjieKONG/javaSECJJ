package homework.day12.Checkpoint1.test5;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> coll = new ArrayList<>();
        //往ArrayList中添加元素
        coll.add("xiaomi1");
        coll.add("xiaomi2");
        coll.add("xiaomi3");
        coll.add("xiaomi4");
        //使用增强for循环获取元素
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
