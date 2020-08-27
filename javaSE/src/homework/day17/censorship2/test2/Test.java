package homework.day17.censorship2.test2;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 使用Scanner类进行键盘录入数据
        Scanner scanner=new Scanner(System.in);
        // 将键盘输入的内容存放到字符串中
        String str=scanner.nextLine();
        // 使用File类的构造方法创建文件对象
        File file=new File(str);
        // 判断文件对象是文件还是文件夹，如果是文件，则直接输出文件大小
        if(file.isFile()){
            System.out.println(file.length());
        }else {
            // 定义一个求和变量，
            int sum=0;
            // 如果是文件夹，则获得该文件夹下所有的文件，遍历文件数组获得每一个文件的大小并累加到求和变量中，最后输出求和变量的值。
            for (File listFile : file.listFiles()) {
                sum+=listFile.length();
            }
            System.out.println(sum);
        }
    }
}
