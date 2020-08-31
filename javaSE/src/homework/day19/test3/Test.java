package homework.day19.test3;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象并关联文件路径
        // 利用字节输入流对象创建高效字节输入流对象
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("c:/c.png"));
        // 创建字节输出流对象并关联文件路径
        // 利用字节输出流对象创建高效字节输出流对象
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("d:/c.png"));
        int len;
        // 创建字节数组用来存放读取的字节数
        byte[] bytes = new byte[1024];
        // 利用高效字节输入流循环读取文件数据，每读取一个字节数组，
        // 利用高效字节输出流对象将字节数组的内容输出到目标文件中。
        // 直到读取到文件末尾。
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        // 关闭高效流对象
        outputStream.close();
        inputStream.close();
    }
}
