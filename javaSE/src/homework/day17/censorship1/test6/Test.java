package homework.day17.censorship1.test6;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建文件对象关联路径：c:/aaa/b.txt
        File file = new File("c:/aaa/b.txt");
        // 在c盘aaa文件夹中创建一个b.txt文件并输入数据
        file.createNewFile();
        // 调用文件对象的相关方法获得信息并输出。
        System.out.println("文件名：" + file.getName());
        System.out.println("文件大小：" + file.length());
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件父路径：" + file.getParent());
    }
}
