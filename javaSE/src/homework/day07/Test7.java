package homework.day07;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个QQ号码：");
        String str = in.next();
        System.out.println("这个QQ号码是否正确："+checkQQ(str));
    }
    public static boolean checkQQ(String qq) {
        if(qq.startsWith("0")||qq.length() < 5 && qq.length() > 12){
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            if (qq.charAt(i) < '0' || qq.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
