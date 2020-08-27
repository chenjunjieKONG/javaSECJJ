package homework.day14.checkpoint2.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 创建HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        // 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        // 循环判断HashMap键值对数量是否小于5
        while (hashMap.size() < 5) {
            // HashMap数量小于5个就让用户接着输入
            String s = scanner.next();
            String[] s1 = s.split("");// 使用,分割用户输入的字符串
            hashMap.put(s1[0], s1[1]);// 将分割后的索引为0的字符串作为key,索引为1的字符串作为value,放入HashMap中
            System.out.println(hashMap);
        }
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry);// 输出HashMap中的数据
        }
    }
}
