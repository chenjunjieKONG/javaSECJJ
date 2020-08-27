package homework.day19.test10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("text1.txt"));
//        InputStreamReader reader=new InputStreamReader(new FileInputStream("text.txt"),"GBK");
//        OutputStreamWriter writer=new OutputStreamWriter(new FileOutputStream("text1.txt"));
        List<String> list = new ArrayList<>();
        String len;
        while ((len = reader.readLine()) != null) {
            list.add(len);
        }
        Collections.reverse(list);
        for (String s : list) {
            writer.write(s);
            writer.newLine();
        }
        System.out.println(list);
        writer.close();
        reader.close();
    }
}
