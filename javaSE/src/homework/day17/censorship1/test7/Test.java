package homework.day17.censorship1.test7;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建文件对象
        File file = new File("c:/a.txt");
        file.createNewFile();
        // 调用文件对象的判断是否是文件或是否是文件夹的方法
        if (file.isFile()) {
            // 获得文件名，根据判断结果输出信息。
            System.out.println(file.getName() + "是一个文件");
        } else {
            System.out.println(file.getName() + "不是一个文件");
        }
        // 创建文件夹对象
        File file1 = new File("c:/aaa");
        // 调用文件对象的判断是否是文件或是否是文件夹的方法
        if (file1.isDirectory()) {
            // 获得文件夹名，根据判断结果输出信息。
            System.out.println(file1.getName() + "是一个文件夹");
        } else {
            System.out.println(file1.getName() + "不是一个文件夹");
        }
    }
}
