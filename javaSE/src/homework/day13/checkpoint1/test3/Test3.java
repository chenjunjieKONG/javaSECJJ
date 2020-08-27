package homework.day13.checkpoint1.test3;

import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        // 创建LinkedList
        LinkedList<String> list=new LinkedList<>();
        //使用add方法添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        //使用add方法在指定索引添加元素
        list.add(2,"Q");
        System.out.println(list);
        //使用set方法修改指定位置索引
        list.set(4,"a");
        System.out.println(list);
        // 使用get方法获取指定索引的元素
        System.out.println(list.get(5));
        //使用size方法获取集合大小
        System.out.println(list.size());
        //使用remove方法删除指定索引的元素
        list.remove(2);
        System.out.println(list);
        //使用clear清空集合中的元素
        list.clear();
        System.out.println(list);
    }
}
