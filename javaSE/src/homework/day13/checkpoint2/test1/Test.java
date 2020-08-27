package homework.day13.checkpoint2.test1;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println(list);
        HashSet<String> set=new HashSet<>();
        set.addAll(list);
        System.out.println(set);
        list.clear();
        System.out.println(list);
        list.addAll(set);
        System.out.println(list);

    }
}
