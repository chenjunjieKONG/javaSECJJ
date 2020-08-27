package homework.day14.checkpoint2.test4;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        // 使用nextLine从键盘中读取一行内容
        String string = scanner.nextLine();
        // 将字符串转换成字符数组
        char[] chars = string.toCharArray();
        // 创建map集合，用来存放字符：key是字符 value是字符出现的个数
        HashMap<Character, Integer> hashMap = new HashMap<>();
        // 遍历字符数组
        for (int i = 0; i < chars.length; i++) {
            // 拿到每个字符,去map中查看是否有保存对应的次数
            if (!hashMap.containsKey(chars[i])) {
                // 如果这个字符没有保存次数,就设置为1次
                hashMap.put(chars[i], 1);
            } else {
                // 如果这个字符有保存次数,就设置为原来的次数+1次
                Integer item = hashMap.get(chars[i]);
                hashMap.put(chars[i], item + 1);
            }
        }
        // 创建字符串缓冲区对象
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : hashMap.keySet()) {
            stringBuilder = stringBuilder.append(character + "(" + hashMap.get(character) + ")");

        }
        System.out.print(stringBuilder);

        // 按题目要求拼接字符串

        // 输出结果
    }
}
