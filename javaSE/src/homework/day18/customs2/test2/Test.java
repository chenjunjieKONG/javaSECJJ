package homework.day18.customs2.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        File file = new File("c:/d1");
        for (File listFile : file.listFiles()) {
            FileInputStream inputStream = null;
            FileOutputStream outputStream = null;
            try {
                inputStream = new FileInputStream(listFile);
                outputStream = new FileOutputStream("C:/d2" + "/" + listFile.getName());
                int len;
                while ((len = inputStream.read()) != -1) {
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
}
