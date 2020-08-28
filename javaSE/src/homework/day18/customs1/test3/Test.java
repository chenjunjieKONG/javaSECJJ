package homework.day18.customs1.test3;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            //创建字节输出流FileOutputStream对象并指定文件路径。
            fileOutputStream = new FileOutputStream("D:/c.txt", true);
            for (int i = 0; i < 5; i++) {
                //循环写入数据
                fileOutputStream.write("I love java\r\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
