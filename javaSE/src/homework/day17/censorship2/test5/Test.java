package homework.day17.censorship2.test5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建键盘录入对象Scanner
        Scanner scanner=new Scanner(System.in);
        // 定义字符串接收用户输入的文件夹路径
        String str=scanner.nextLine();
        // 根据文件夹路径创建文件对象
        File file=new File(str);
        // 调用文件对象的listFiles方法获得文件数组
        for (File listFile : file.listFiles()) {
            listFile.delete();
        }
        file.delete();
        // 遍历文件数组，删除每一个文件
        // 最后调用删除方法删除文件夹。
    }
}
