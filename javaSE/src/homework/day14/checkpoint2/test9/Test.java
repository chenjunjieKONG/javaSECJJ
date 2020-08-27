package homework.day14.checkpoint2.test9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 创建HashMap集合key存放书名,value存放价格
        HashMap<String, String> hashMap = new HashMap<>();
        // 创建键盘录入对象Scanner
        Scanner scanner = new Scanner(System.in);
        // 循环判断HashSet的数量是否小于5
        while (hashMap.size() < 5) {
            // 如果HashSet的数量小于5,让用户输入一本书的信息
            String s = scanner.nextLine();
            // 使用,分割书名和价格
            String[] strArr = s.split(",");
            // 将书名和价格添加到HashMap中
            hashMap.put(strArr[0], strArr[1]);
        }
        // 使用remove方法删除集合中的C++这本书
        hashMap.remove("C++");
        // 使用put方法将Java的这本书涨价为38.5元
        hashMap.put("java", "38.5");
        // 使用keySet遍历Map
        for (String str : hashMap.keySet()) {
            System.out.println(str + "=" + hashMap.get(str));
        }
        // 使用entrySet遍历Map
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
