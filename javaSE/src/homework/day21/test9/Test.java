package homework.day21.test9;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        // 判断属性文件是否存在，如果不存在则创建一个。
        File file=new File("D:/javaSECJJ/javaSE/src/homework/day21/test9/Balance.properties");
        if(file.exists()){
            //创建Properties集合
            Properties properties=new Properties();
            // 使用load()方法加载文件中所有的属性到Properties集合中。
            properties.load(new FileInputStream(file));
            show(properties,file);
        }else {
            //创建properties文件
            file.createNewFile();
            //创建输出流
            FileOutputStream fos=new FileOutputStream(file);
            //写入
            fos.write("count=null".getBytes());
        }
    }
    public static void show(Properties properties,File file) throws IOException {
        //获取Properties集合里面的键
        Set<String> set = properties.stringPropertyNames();
        //遍历Properties集合的键
        // 取得count属性，
        for (String s : set) {
            //判断是否是null,如果count属性为null，
            if(properties.getProperty(s).equals("null")){
                // 则设置count属性为0。
                properties.setProperty(s,"0");
            }
            // 将取得的字符串转成整型，
            int i=Integer.parseInt(properties.getProperty(s));
            // 创建输出流
            OutputStream outputStream=new FileOutputStream(file);
            // 并判断是否大于等于3次，
            if(i<3){// 小于3则输出运行次数，并加1。
                // 将整数转成字符串后存到Properties集合中。
                properties.setProperty(s, String.valueOf(i+1));
                // 并用store方法保存到文件中。
                properties.store(outputStream,String.valueOf(i+1));
            }else {// 大于3次则到期，退出。
                System.out.println("程序使用次数已满，请续费");
                // 将整数转成字符串后存到Properties集合中。
                properties.setProperty(s, "0");
                // 并用store方法保存到文件中。
                properties.store(outputStream, null);
                System.out.println("已续费,你可以继续运行");
            }
            System.out.println("你已运行了"+properties.getProperty(s)+"次,你还剩下"+(3-Integer.parseInt(properties.getProperty(s)))+"次");
        }
    }
}
