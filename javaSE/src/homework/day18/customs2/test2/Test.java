package homework.day18.customs2.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("c:/d1");
        for (File listFile : file.listFiles()) {
            FileInputStream inputStream=new FileInputStream(listFile);
            FileOutputStream outputStream=new FileOutputStream("C:/d2"+"/"+listFile.getName());
            int len;
            while ((len=inputStream.read())!=-1){
                outputStream.write(len);
            }
            outputStream.close();
            inputStream.close();
        }
    }
}
