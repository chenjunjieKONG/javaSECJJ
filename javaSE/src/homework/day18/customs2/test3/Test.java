package homework.day18.customs2.test3;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        show('a');
    }
    public static void show(char chars) throws IOException {
        FileInputStream inputStream=new FileInputStream("c:/test.txt");
        int count=0;
        int len;
        while ((len=inputStream.read())!=-1){
            if((char)len==chars){
                count++;
            }
        }
        System.out.println(chars+"出现"+count+"次");
    }
}
