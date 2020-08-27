package homework.day12.Checkpoint1.test3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> list = new ArrayList<>();
        //. 往集合中存放元素
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        //获取容器的迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {//使用迭代器判断是否有下一个元素
            //使用迭代器对象获取集合中的元素
            String str = it.next();
            System.out.println(str);
        }
    }
}
