package homework.day14.checkpoint1.test3;

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
        // 使用Map的values方法获取到所有的value
        System.out.println(hashMap.values());
        // 使用增强for获取每个value
        for (String value : hashMap.values()) {
            System.out.println(value);
        }
        // 使用迭代器获取每个value
        Iterator<String> it = hashMap.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
