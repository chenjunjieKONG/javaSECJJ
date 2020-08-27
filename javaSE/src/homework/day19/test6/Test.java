package homework.day19.test6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader=new InputStreamReader(new FileInputStream("c:/a.txt"),"gbk");
        int line;
        while ((line=reader.read())!=-1){
            System.out.print((char)line);
        }
        reader.close();
    }
}
