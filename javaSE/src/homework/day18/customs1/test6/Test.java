package homework.day18.customs1.test6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream=new FileInputStream("C:/a.png");
        FileOutputStream outputStream=new FileOutputStream("D:/a.png");
        int len;
        while ((len=inputStream.read())!=-1){
            outputStream.write(len);
        }
        outputStream.close();
        inputStream.close();
    }
}
