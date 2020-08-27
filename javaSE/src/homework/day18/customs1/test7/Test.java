package homework.day18.customs1.test7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream=new FileInputStream("C:/a.png");
        FileOutputStream outputStream=new FileOutputStream("D:/a.png");
        int len;
        byte[] bytes=new byte[1024];
        while ((len=inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }
        outputStream.close();
        inputStream.close();
    }
}
