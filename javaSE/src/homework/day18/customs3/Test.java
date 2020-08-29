package homework.day18.customs3;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    //定义集合
    static ArrayList<String> list = new ArrayList<>();
    //计数器
    static int count = 0;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        File file = new File(str);
        System.out.println("java文件数量："+sizer(file));
    }

    //文件过滤器，并返回文件数组
    public static File[] filtration(File file) {
        File[] files = file.listFiles(file1 -> {
            return file1.isDirectory() || file1.getName().endsWith(".java");
        });
        return files;
    }

    //读取文件和写入文件
    public static void readWrite(FileInputStream inputStream, FileOutputStream outputStream) throws IOException {
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
    }

    public static int sizer(File file) throws IOException {
        File[] files = filtration(file);
        for (File file1 : files) {
            if (file1.isFile()) {
                //获取遍历数组的文件的字节输入流，用于读取
                FileInputStream inputStream = new FileInputStream(file1);
                //判断文件名是否存在集合里面
                if (list.contains(file1.getName())) {
                    //存在就根据"\\."截取文件名
                    String[] s = (file1.getName()).split("\\.");
                    //修改文件名
                    String str = s[0] + ("("+System.currentTimeMillis()+")") + "." + s[1];
                    //添加进集合，用于判断上面的是否存在
                    list.add(str);
                    //获取遍历数组的文件的字节输出流，用于写入
                    FileOutputStream outputStream = new FileOutputStream("D:/java" + "/" + str);
                    //调用方法来完成读取和写入
                    readWrite(inputStream, outputStream);
                    //计数器加1；
                    count++;
                    //关闭资源
                    outputStream.close();
                } else {//不存在就直接写入文件
                    //获取遍历数组的文件的字节输出流，用于写入
                    FileOutputStream outputStream = new FileOutputStream("D:/java" + "/" + file1.getName());
                    //添加进集合，用于判断上面的是否存在
                    list.add(file1.getName());
                    //调用方法来完成读取和写入
                    readWrite(inputStream, outputStream);
                    //计数器加1；
                    count++;
                    //关闭资源
                    outputStream.close();
                }
                inputStream.close();
            } else {
                sizer(file1);
            }
        }
        return count;
    }
}
