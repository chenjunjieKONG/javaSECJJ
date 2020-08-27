package homework.day13.checkpoint2.test5;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        // 创建arr数组
        String arr[] = {"abc", "bad", "abc", "aab", "bad", "cef", "jhi"};
        // 创建HashSet集合
        HashSet<String> hashSet = new HashSet<>();
        // 遍历arr数组
        for (String s : arr) {
            // 将arr数组中的元素添加进HashSet中.重复的就不会添加进去了
            hashSet.add(s);
        }
        // 创建ArrayList集合,将HashSet的元素添加到ArrayList中
        ArrayList<String> list = new ArrayList<>();
        list.addAll(hashSet);
        // 遍历ArrayList打印元素
        for (String s : list) {
            System.out.println(s);
        }
    }
}
