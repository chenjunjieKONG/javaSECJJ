package homework.day19.test10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        //创建缓冲字符输入流，用于读取数据
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        //创建缓冲字符输出流，用于写入数据
        BufferedWriter writer = new BufferedWriter(new FileWriter("text1.txt"));
        //创建list集合，用于存储读取的数据
        List<String> list = new ArrayList<>();
        //读取数据，放假集合中
        String len;
        while ((len = reader.readLine()) != null) {
            list.add(len);
        }
        //反转集合
        Collections.reverse(list);
        //遍历集合
        for (String s : list) {
            //把集合中的数据写入文件
            writer.write(s);
            //换行
            writer.newLine();
        }
        System.out.println(list);
        //关闭流并释放资源
        writer.close();
        reader.close();
    }
}
