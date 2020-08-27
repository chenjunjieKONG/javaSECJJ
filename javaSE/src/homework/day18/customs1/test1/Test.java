package homework.day18.customs1.test1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建字节输出流FileOutputStream对象并指定文件路径。
        FileOutputStream fileOutputStream=new FileOutputStream("C:/a.txt");
        // 调用字节输出流的write(int byte)方法写出数据
        fileOutputStream.write(99);
    }
}
