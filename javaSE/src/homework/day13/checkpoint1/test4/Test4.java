package homework.day13.checkpoint1.test4;

import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        // 创建LinkedList
        LinkedList<String> list=new LinkedList<>();
        //使用add方法添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        //使用addFirst添加元素到集合最前面
        list.addFirst("A");
        System.out.println(list);
        //使用addLast添加元素到集合最后面
        list.addLast("B");
        System.out.println(list);
        //使用getFirst获取集合第一个元素
        System.out.println(list.getFirst());
        //使用getLast获取集合最后一个元素
        System.out.println(list.getLast());
        // 使用removeLast删除集合第一个元素
        list.removeFirst();
        System.out.println(list);
        //使用removeLast删除集合最后一个元素
        list.removeLast();
        System.out.println(list);
    }
}
