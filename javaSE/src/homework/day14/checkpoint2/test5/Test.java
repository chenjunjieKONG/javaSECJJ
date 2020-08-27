package homework.day14.checkpoint2.test5;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        // 使用nextLine获取用户录入的字符串
        String s = scanner.nextLine();
        // 定义一个Map用于统计,字母,空格,数字和其他字符的数量,key是字符value是字符出现的次数
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 将输入的字符串转成字符
        char[] chars = s.toCharArray();
        // 遍历字符串数组中的每一个字符
        for (char ch : chars) {
            // 如果ch是一个字符,调用countingKey方法传入(map,"字母")作为参数
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                countingKey(hashMap, "字母");
            } else if (ch == ' ') {// 如果字符是一个空格,调用countingKey方法传入(map, "空格")作为参数
                countingKey(hashMap, "空格");
            } else if (ch >= '0' && ch <= '9') {// 如果字符是一个数字,调用countingKey方法传入(map, "数字")作为参数
                countingKey(hashMap, "数字");
            } else {// 如果字符是一个其他,调用countingKey方法传入(map, "其他")作为参数
                countingKey(hashMap, "其他");
            }
        }
        // 打印统计结果
        for (String s1 : hashMap.keySet()) {
            System.out.println(s1 + "=" + hashMap.get(s1));
        }
    }

    // 定义countingKey(HashMap map,String key)方法.用于统计key出现的次数.调用一次,让key所对应的次数+1.
    public static void countingKey(HashMap map, String key) {
        // 在countingKey方法中.使用get方法从map中取出key的值
        map.get(key);
        // 如果为空,说明key第一次出现
        if (!map.containsKey(key)) {
            map.put(key, 1);// 放入key,把次数设置为1
        } else {// 如果之前,已经有key了,就把key的次数+1;
            map.put(key, (int) map.get(key) + 1);
        }
    }
}
