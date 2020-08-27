package homework.day14.checkpoint2.test7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // If you wantto change your fate I think you must come to the dark horse to learnjava
        // 创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        // 使用nextLine从键盘中读取一行内容
        String string = scanner.nextLine();
        // 定义HashMap,key是单词,value是字符对应的次数
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 使用空格分割字符串
        String[] strArr = string.split(" ");
        // 遍历分割好的每个字符串
        for (String s : strArr) {
            // 获取拿到每个字符串,使用字符去HashMap中查找次数
            if (!hashMap.containsKey(s)) {// 如果为空,说明该字符串第一次出现
                hashMap.put(s, 1);// 放入字符串作为key,把次数设置为1
            } else {// 如果之前,已经有字符串了,就把字符的次数+1
                hashMap.put(s, hashMap.get(s) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
