package homework.day19.test6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象指定文件路径。
        // 根据字节输入流对象创建转换输入流对象并指定字符集编码为：gbk
        InputStreamReader reader = new InputStreamReader(new FileInputStream("c:/a.txt"), "gbk");
        // 调用转换输入流对象的读取方法读取内容
        int line;
        while ((line = reader.read()) != -1) {
            System.out.print((char) line);
        }
        // 关闭流释放资源
        reader.close();
    }
}
