package homework.day19.test2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建字节输出流对象关联文件路径
        // 利用字节输出流对象创建高效字节输出流对象
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("c:/e.txt"));
        // 定义字符串存放要输出的数据，然后将字符串转换为字节数组。
        byte[] bytes = new String("I love java").getBytes();
        // 调用高效字节输出流对象的write方法将字节数组输出。
        outputStream.write(bytes);
        // 关闭高效流。
        outputStream.close();
    }
}
