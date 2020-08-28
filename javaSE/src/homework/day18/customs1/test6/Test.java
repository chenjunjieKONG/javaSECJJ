package homework.day18.customs1.test6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileInputStream inputStream= null;
        FileOutputStream outputStream= null;
        try {
            //创建字节输入流，用于读取
            inputStream = new FileInputStream("C:/c.png");
            //创建字节输出流，用于写入
            outputStream = new FileOutputStream("D:/a.png");
            int len;
            while ((len=inputStream.read())!=-1){
                outputStream.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
