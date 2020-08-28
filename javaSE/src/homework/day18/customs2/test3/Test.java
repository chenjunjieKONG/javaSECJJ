package homework.day18.customs2.test3;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        show('a');
    }

    public static void show(char chars) {
        FileInputStream inputStream = null;
        //计数器
        int count = 0;
        try {
            //创建字节输入流，用于读取
            inputStream = new FileInputStream("c:/test.txt");
            count = 0;
            int len;
            while ((len = inputStream.read()) != -1) {
                if ((char) len == chars) {//判断字符是否相等
                    count++;
                }
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
        }
        System.out.println(chars + "出现" + count + "次");
    }
}
