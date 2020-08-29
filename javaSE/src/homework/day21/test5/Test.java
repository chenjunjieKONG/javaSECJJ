package homework.day21.test5;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        //在编写一个类，用键盘输入一个字符串，该字符串就是类A的全名，使用反射机制创建该类的对象
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        Class c=Class.forName(s);
        //调用该对象中的方法showString
        Method method=c.getMethod("showString");
        method.invoke(c.newInstance());
    }
}
