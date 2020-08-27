package homework.day13.checkpoint2.test2;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<String> hashSet = new HashSet<>();
        //使用add方法往HashSet中添加元素
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        hashSet.add("二丫");
        hashSet.add("钱六");
        hashSet.add("孙七");
        System.out.println(hashSet);
        //使用remove方法删除HashSet中的二丫
        hashSet.remove("二丫");
        System.out.println(hashSet);
        //使用add方法往HashSet中添加王小丫
        hashSet.add("王小丫");
        System.out.println(hashSet);
    }
}
