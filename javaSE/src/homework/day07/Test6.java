package homework.day07;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        String mgc = "奥巴马";
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String no = in.next();
        System.out.println(no.replace(mgc, "*"));
    }
}
