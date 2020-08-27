package homework.day14.checkpoint1.test5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        // 创建HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        // 使用put添加元素
        hashMap.put("邓超", "孙俪");
        hashMap.put("李晨", "范冰冰");
        hashMap.put("刘德华", "柳岩");
        hashMap.put("黄晓明", "Baby");
        // 使用entrySet方法获取到所有的键值对关系
        Set<Map.Entry<String, String>> key = hashMap.entrySet();
        // 获取entrySet的迭代器
        Iterator<Map.Entry<String, String>> it = key.iterator();
        // 使用迭代器查看是否有下一个元素
        while (it.hasNext()) {
            // 使用迭代器拿到下一个元素(Entry类型)
            Map.Entry<String, String> bui = it.next();
            // 通过一个Entry获取到key和value
            System.out.println(bui);
        }


    }
}
