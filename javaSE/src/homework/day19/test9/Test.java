package homework.day19.test9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("ABCD");
        // 创建字节打印流对象并关联文件路径
        PrintStream stream = new PrintStream("d.txt");
        // 调用字节打印流对象的打印方法将内容输入到目标文件中
        System.setOut(stream);
        System.out.println("ABCD");
        // 关闭流释放资源
        stream.close();
    }
}
