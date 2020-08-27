package homework.day17.censorship2.test6;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 创建键盘录入对象Scanner
        Scanner scanner = new Scanner(System.in);
        // 定义字符串接收用户输入的文件夹路径
        String str = scanner.nextLine();
        // 根据文件夹路径创建文件对象
        File file = new File(str);
        // 调用calculate方法传入文件夹对象，在该方法内部获得文件夹中所有文件，
        System.out.println(calculate(file));
    }

    // 定义一个方法calculate用来计算指定文件夹的大小，接收文件参数，返回long类型数值表示文件夹的大小。
    public static long calculate(File file) {
        //定义一个变量size累加每一个文件的大小
        long size = 0;
        // 遍历文件数组
        for (File listFile : file.listFiles()) {
            // 判断是否是文件，如果是文件则获得文件大小并累加到变量size中
            if (listFile.isFile()) {
                size += listFile.length();
                System.out.println(listFile.getName());
            } else {// 如果是文件夹，继续递归调用当前方法。
                calculate(listFile);
            }
        }
        return size;
    }
}
