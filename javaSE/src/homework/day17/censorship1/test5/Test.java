package homework.day17.censorship1.test5;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        // 创建文件对象关联路径：c:/a.txt
        File file=new File("c:/a.txt");
        // 调用文件对象删除文件的方法
        file.delete();
        // 创建文件对象关联路径：c:/aaa
        File file1=new File("c:/aaa");
        // 调用文件对象删除文件的方法
        file1.delete();
    }
}
