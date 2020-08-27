package homework.day13.checkpoint2.test9;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        // 创建ArrayList array1
        ArrayList<String> array1=new ArrayList<>();
        // 使用add方法为array1存放对应的元素
        array1.add("a");
        array1.add("b");
        array1.add("a");
        array1.add("c");
        array1.add("d");
        // 创建ArrayList array2
        ArrayList<String> array2=new ArrayList<>();
        // 使用add方法为array2存放对应的元素
        array2.add("e");
        array2.add("f");
        array2.add("a");
        array2.add("d");
        array2.add("g");
        // 创建HashSet用于存放去除重复的元素
        HashSet<String> hashSet=new HashSet<>();
        // 遍历array1,获取到每个元素,将每个元素添加到HashSet中
        for (String s : array1) {
            hashSet.add(s);
        }
        // 遍历array2,获取到每个元素,将每个元素添加到HashSet中
        for (String s : array2) {
            hashSet.add(s);
        }
        // 输出HashSet中去除重复后的元素
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
