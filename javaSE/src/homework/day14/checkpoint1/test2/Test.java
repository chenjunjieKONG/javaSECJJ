package homework.day14.checkpoint1.test2;

import java.util.HashMap;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // 创建HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        // 使用put添加元素
        hashMap.put("小明", "小花");
        hashMap.put("小天", "小红");
        hashMap.put("小白", "小黑");
        // 使用Map的keySet方法获取到所有的key
        System.out.println(hashMap.keySet());
        // 使用增强for获取每个key
        for (String s : hashMap.keySet()) {
            System.out.println(s);
        }
        // 获取keySet的迭代器
        Iterator<String> it = hashMap.keySet().iterator();
        // 循环判断迭代器中是否有下一个元素
        while (it.hasNext()) {
            System.out.println(it.next());// 使用迭代器获取每个key
        }

    }
}
