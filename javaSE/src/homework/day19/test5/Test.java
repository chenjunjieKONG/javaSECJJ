package homework.day19.test5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建文件字节输出流关联目标文件
        // 根据文件字节输出流创建转换输出流对象，并指定编码字符集为：gbk
        OutputStreamWriter outputStream=new OutputStreamWriter(new FileOutputStream("c:/a.txt"),"gbk");
        // 调用流对象的方法将字符串写出到文件中。
        outputStream.write("我爱java");
        // 关闭流并释放资源。
        outputStream.close();
    }
}
