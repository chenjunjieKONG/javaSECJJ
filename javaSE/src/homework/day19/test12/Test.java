package homework.day19.test12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test {
    public static void main(String[] args) throws IOException {
        // 获取Path
        Path path= Paths.get("a.txt");
        // 复制文件
        Files.copy(path,Paths.get("e.txt"), StandardCopyOption.REPLACE_EXISTING);
        // 创建字符流读取字符
        BufferedReader reader=new BufferedReader(new FileReader("e.txt"));
        String len;
        while ((len=reader.readLine())!=null){
            System.out.println(len);
        }
        // 释放资源
        reader.close();
    }
}
