package homework.day19;

import java.io.*;

public class T {
    public static void main(String[] args) throws IOException {
        // 定义文件路径,文件为gbk编码
        String FileName = "c:\\a.txt";
        // 创建流对象,默认UTF8编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(FileName));
        // 创建流对象,指定GBK编码
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream(FileName), "GBK");
        // 定义变量,保存字符
        int read;
        // 使用默认编码字符流读取,乱码
        while ((read = isr.read()) !=-1){
            System.out.print((char) read); // ��Һ�
        }
        isr.close();
        System.out.println();
        // 使用指定编码字符流读取,正常解析
        while ((read = isr2.read()) !=-1){
            System.out.print((char) read);// 大家好
        }
        isr2.close();
//        // 定义文件路径
//        String FileName1 = "c:\\a.txt";
//        // 创建流对象,默认UTF8编码
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(FileName1));
//        // 写出数据
//        osw.write("你好"); // 保存为6个字节
//        osw.close();
        // 定义文件路径
        String FileName2 = "c:\\a.txt";
        // 创建流对象,指定GBK编码
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream(FileName2),"GBK");
        // 写出数据
        osw2.write("你好");// 保存为4个字节
        osw2.close();

    }
}
