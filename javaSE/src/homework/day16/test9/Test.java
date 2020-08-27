package homework.day16.test9;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.forEach(n->System.out.println(n));
        Set<String> set=new LinkedHashSet<>();
        set.add("小花");
        set.add("小天");
        set.add("小红");
        set.add("小名");
        set.forEach(n->System.out.println(n));
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"小花");
        map.put(2,"小天");
        map.put(3,"小红");
        map.put(4,"小名");
        map.forEach((k,v)->System.out.println(k+"="+v));
    }
}
