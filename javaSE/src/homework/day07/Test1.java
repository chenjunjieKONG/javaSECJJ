package homework.day07;

public class Test1 {
    public static void main(String[] args) {
        String str1=new String("你好");
        System.out.println("方式一创建字符串："+str1);

        char[] chars={'h','e','l','l','o'};
        String str2=new String(chars);
        System.out.println("方式二创建字符串："+str2);

        byte[] bytes={97,98,99,100,101};
        String str3=new String(bytes);
        System.out.println("方式三创建字符串："+str3);

    }
}
