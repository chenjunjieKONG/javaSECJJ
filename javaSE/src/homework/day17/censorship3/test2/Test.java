package homework.day17.censorship3.test2;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘输入语句
        Scanner scanner=new Scanner(System.in);
        //把输入内容赋值给String
        String str=scanner.nextLine();
        //创建文件对象
        File file=new File(str);
        //调用方法
        show(file);
    }
    public static void show(File file){
        //遍历文件数组
        for (File listFile : file.listFiles()) {
            if(listFile.isDirectory()){//判断是不是文件夹
                show(listFile);//递归
            }
            //删除文件夹
            listFile.delete();
        }
    }
}
