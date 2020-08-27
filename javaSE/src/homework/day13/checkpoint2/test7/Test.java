package homework.day13.checkpoint2.test7;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 创建Scanner对象,用于键盘录入
        Scanner scanner=new Scanner(System.in);
        // 调用Scanner的nextLine()方法,让用户输入一个字符串
        String str=scanner.nextLine();
        // 创建LinkedHashSet.用于去除重复的字符串,并保证迭代顺序
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        // 将字符串串转成char[]
        char[] chars=str.toCharArray();
        // 使用增强for循环遍历每个字符
        for (char aChar : chars) {
            linkedHashSet.add(aChar+"");// 将每个字符添加到LinkedHashSet中
        }
        // 使用增强for打印LinkedHashSet中的内容
        for (String s : linkedHashSet) {
            System.out.print(s);
        }
    }
}
