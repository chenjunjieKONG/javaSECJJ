package homework.day14.checkpoint1.test4;

import java.util.HashMap;
import java.util.Iterator;
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
        // 使用keySet方法获取所有的键
        Set<String> key = hashMap.keySet();
        // 获取到keySet的迭代器
        Iterator<String> it = key.iterator();
        // 循环判断迭代器中是否有下一个元素
        while (it.hasNext()) {
            String str = it.next();// 使用迭代器next方法获取到一个键
            // 通过一个键找到一个值 输出键和值
            System.out.println(str + "=" + hashMap.get(str));
        }


    }
}
