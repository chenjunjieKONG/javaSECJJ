package homework.day14.checkpoint1.test1;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        // 创建HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        // 使用put添加元素
        hashMap.put("小明", "小花");
        hashMap.put("小天", "小红");
        hashMap.put("小白", "小黑");
        System.out.println(hashMap);
        // 使用put修改元素
        hashMap.put("小天", "小地");
        System.out.println(hashMap);
        // 使用get获取元素
        System.out.println(hashMap.get("小天"));
        // 使用remove删除元素
        hashMap.remove("小明");
        // 打印集合中的元素
        System.out.println(hashMap);
    }
}
