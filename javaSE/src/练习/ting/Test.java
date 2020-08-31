package 练习.ting;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> hashMap=new HashMap<>();
        BufferedReader br=new BufferedReader(new FileReader("C:/2.txt"));
        String len;
        while ((len=br.readLine())!=null){
            len =len.trim();
            String[] split = len.split("\\.");
            String replace = split[0].replace("\uFEFF", "");
            hashMap.put(replace,split[1]);
        }
        br.close();
        BufferedWriter bw=new BufferedWriter(new FileWriter("c:/1.txt"));
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            bw.write(entry.getKey()+"."+entry.getValue());
            bw.newLine();
        }
        bw.close();
    }
}
