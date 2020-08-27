package homework.day14.checkpoint2.test3;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        // 定义HashMap,编号作为key,姓名作为value
        HashMap<Integer, String> hashMap = new HashMap<>();
        // 使用put方法添加元素
        hashMap.put(1, "张三丰");
        hashMap.put(2, "周芷若");
        hashMap.put(3, "汪峰");
        hashMap.put(4, "灭绝师太");
        // 使用keySet+增强for迭代map中的元素,并打印
        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer + "=" + hashMap.get(integer));
        }
        // 使用put向该map集合中插入一个编码为5姓名为李晓红的信息
        System.out.println("----------------------");
        hashMap.put(5, "李晓红");
        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer + "=" + hashMap.get(integer));
        }
        // 使用remove移除该map中的编号为1的信息
        System.out.println("----------------------");
        hashMap.remove(1);
        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer + "=" + hashMap.get(integer));
        }
        // 使用put将map集合中编号为2的姓名信息修改为"周林"
        System.out.println("----------------------");
        hashMap.put(2, "周林");
        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer + "=" + hashMap.get(integer));
        }

    }
}
