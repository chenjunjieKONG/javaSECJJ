package homework.day18.customs2.test4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        FileInputStream inputStream=new FileInputStream("c:/score.txt");
        properties.load(inputStream);
        Set<String> set=properties.stringPropertyNames();
        FileOutputStream outputStream=new FileOutputStream("c:/score.txt");
        for (String s : set) {
            if(s.equals("lisi")){
                properties.setProperty(s,"100");
            }
            System.out.println(s+"="+properties.getProperty(s));
            outputStream.write(((s+"="+properties.getProperty(s))+"\r\n").getBytes());
        }
    }
}
