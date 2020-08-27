package homework.day19.test4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        //键盘输入语句
        Scanner scanner=new Scanner(System.in);
        //集合
        ArrayList<String> list=new ArrayList<>();
        //高效字符输出流
        BufferedWriter writer=new BufferedWriter(new FileWriter("c:/data.txt"));
        //高效字符输入流
        BufferedReader reader=new BufferedReader(new FileReader("c:/data.txt"));
        while (list.size() < 3) {
            String s = scanner.next();
            list.add(s);
            writer.write(s);//输入内容
            writer.newLine();//换行
            writer.flush();//刷新缓冲区
        }
        String s = scanner.next();
        String len;
        while ((len=reader.readLine())!=null){
            if (s.equals(len)) {//判断是否存在
                System.out.println("验证成功");
                break;
            } else {
                System.out.println("验证失败");
                break;
            }
        }
        //释放资源
        reader.close();
        writer.close();

    }
}
