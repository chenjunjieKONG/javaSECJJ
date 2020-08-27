package homework.day13.checkpoint1.test5;

import java.util.HashSet;
import java.util.Iterator;

public class Test5 {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<String> list=new HashSet<>();
        //使用add方法往HashSet添加元素
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhangsan");
        System.out.println(list);
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            System.out.println(str);
        }
    }
}
