package homework.day18.customs1.test3;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("c:/c.txt",true);
        for (int i = 0; i < 5; i++) {
            fileOutputStream.write("I love java\r\n".getBytes());
        }
    }
}
