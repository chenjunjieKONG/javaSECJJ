package homework.day13.checkpoint1.test9;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //创建ArrayList
        ArrayList<Integer> list=new ArrayList<>();
        //添加数据到ArrayList
        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);
        System.out.println(list);
        //使用Collections.sort()对ArrayList集合中的数据进行排序,并打印出排序后的结果。
        Collections.sort(list);
        System.out.println(list);
        //使用Collections.shuffle ()对ArrayList集合中的数据进行随机打乱顺序,并打印出排序后的结果。
        Collections.shuffle(list);
        System.out.println(list);
        //使用Collections.reverse()对ArrayList集合中的数据进行反转,使用增强for遍历ArrayList集合。
        Collections.reverse(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
