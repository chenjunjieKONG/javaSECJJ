package homework.day18.customs1.test4;

import java.io.FileInputStream;
import java.io.IOException;


public class Test {
    public static void main(String[] args){
        FileInputStream fileInputStream= null;
        try {
            // 创建字节输入流对象指定文件路径。
            fileInputStream = new FileInputStream("d:/c.txt");
            // 调用read(byte b)方法循环读取文件中的数据
            int b;
            while ((b=fileInputStream.read())!=-1){// 直到读取到-1时结束读取
                System.out.println((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
