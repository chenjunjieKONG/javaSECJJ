package homework.day18.customs2.test4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //创建Properties集合
        Properties properties = new Properties();
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            //创建字节输入流，用于读取
            inputStream = new FileInputStream("c:/score.txt");
            //把文件中的数据传进 Properties集合中
            properties.load(inputStream);
            //获取 Properties集合中的所有键
            Set<String> set = properties.stringPropertyNames();
            //创建字节输出流，用于写入
            outputStream = new FileOutputStream("c:/score.txt");
            //遍历Properties集合
            for (String s : set) {
                if (s.equals("lisi")) {//判断集合里面是否存在“list”，有就修改
                    properties.setProperty(s, "100");
                }
                //输出
                System.out.println(s + "=" + properties.getProperty(s));
                //写入
                outputStream.write(((s + "=" + properties.getProperty(s)) + "\r\n").getBytes());
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
