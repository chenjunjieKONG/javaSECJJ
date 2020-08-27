package homework.day19.test1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建字节输出流对象关联文件路径
        // 利用字节输出流对象创建高效字节输出流对象
        BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream("c:/d.txt"));
        // 调用高效字节输出流对象的write方法写出一个字节
        outputStream.write(99);
        // 关闭高效流，释放资源。
        outputStream.close();
    }
}
