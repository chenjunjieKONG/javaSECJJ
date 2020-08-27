package homework.day18.customs2.test1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        // 使用Scanner类进行键盘录入数据
        Scanner scanner=new Scanner(System.in);
        // 创建字节输出流对象关联目标文件
        FileOutputStream outputStream=new FileOutputStream("c:/stu.txt");
        // 使用死循环不停的接收用户输入的学生数据
        while (true){
            System.out.println("请输入学生信息：(格式为：学号-学生名字) 输入end结束");
            String str=scanner.nextLine();
            // 判断输入的内容是否是end，是则终止循环，停止输入。否则就数据写出到文件中。
            if(str.equals("end")){
                break;
            }
            // 接收用户输入的学生数据
            outputStream.write((str+"\r\n").getBytes());
        }
        outputStream.close();
    }
}
