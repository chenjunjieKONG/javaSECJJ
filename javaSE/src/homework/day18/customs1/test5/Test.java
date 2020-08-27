package homework.day18.customs1.test5;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象指定文件路径。
        FileInputStream fileInputStream=new FileInputStream("c:b.txt");
        // 定义一个字节数数组，用来存放读取的字节数
        byte[] bytes=new byte[1];
        // 调用read(byte[]buf)方法传入字节数组，循环读取文件中的数据
        while (fileInputStream.read(bytes)!=-1){// 直到读取到-1时结束读取
            System.out.println(new String(bytes));
        }
    }
}
