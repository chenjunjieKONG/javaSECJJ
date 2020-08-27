package homework.day17.censorship1.test2;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 使用绝对路径创建对象关联到c盘的a.txt。
        File file = new File("c:/a.txt");
        // 通过文件对象方法判断文件是否存在。
        System.out.println("文件是否存在：" + file.exists());
        // 不存在则调用创建文件的方法创建文件。
        System.out.println("文件是否创建：" + file.createNewFile());
        // 通过文件对象方法判断文件是否存在。
        System.out.println("文件是否存在：" + file.exists());

    }
}
