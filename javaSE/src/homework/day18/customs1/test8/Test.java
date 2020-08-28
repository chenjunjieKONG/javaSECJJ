package homework.day18.customs1.test8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            //创建字符输出流，用于写入
            writer = new FileWriter("c:/lnfo.txt");
            //键盘写入
            Scanner scanner = new Scanner(System.in);
            //死循环
            while (true) {
                String str = scanner.nextLine();
                //跳出循环条件
                if (str.equals("886")) {
                    break;
                }
                //写入
                writer.write(str + "\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
