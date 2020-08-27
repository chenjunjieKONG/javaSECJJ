package homework.day17.censorship2.test1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        // 使用Scanner类进行键盘录入数据
        Scanner scanner=new Scanner(System.in);
        // 将键盘输入的内容存放到字符串中
        String str=scanner.nextLine();
        // 使用File类的构造方法创建文件对象
        File file=new File(str);
        // 判断文件是否存在，不存在则创建，存在则输出文件大小
        if(file.exists()){
            System.out.println(file.length());
        }else {
            file.createNewFile();
        }
    }
}
