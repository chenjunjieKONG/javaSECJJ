package homework.day14.checkpoint2.test6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        // 定义ArrayList存放元素
        ArrayList<String> list = new ArrayList<>();
        // 使用add方法添加需要的元素
        list.add("abc");
        list.add("bcd");
        list.add("lod");
        list.add("bol");
        // 定义HashMap,key是字符,value是字符对应的次数
        HashMap<Character, Integer> hashMap = new HashMap<>();
        // 使用增强for获取ArrayList中的每个字符串
        for (String s : list) {
            char[] chars = s.toCharArray();// 将每个字符串转成字符数组
            // 使用增强for遍历字符数组
            for (char aChar : chars) {
                // 获取拿到每个字符,使用字符去HashMap中查找次数
                if (!hashMap.containsKey(aChar)) {// 如果为空,说明该字符第一次出现
                    hashMap.put(aChar, 1);// 放入字符作为key,把次数设置为1
                } else {
                    // 如果之前,已经有字符了,就把字符的次数+1
                    hashMap.put(aChar, hashMap.get(aChar) + 1);
                }
            }
        }
        // 输出map中的内容
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }

    }
}
