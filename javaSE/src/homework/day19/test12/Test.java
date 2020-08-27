package homework.day19.test12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("a.txt");
        Files.copy(path,Paths.get("e.txt"), StandardCopyOption.REPLACE_EXISTING);
        BufferedReader reader=new BufferedReader(new FileReader("e.txt"));
        String len;
        while ((len=reader.readLine())!=null){
            System.out.println(len);
        }
        reader.close();
    }
}
