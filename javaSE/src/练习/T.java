package 练习;

import java.io.File;
import java.io.IOException;

public class T {
    public static void main(String[] args) throws IOException {
        // 文件路径名
        String pathname = "D:\\aaa.txt";
        File file1 = new File(pathname);
        System.out.println(file1);
        // 文件路径名
        String pathname2 = "D:\\aaa\\bbb.txt";
        File file2 = new File(pathname2);
        System.out.println(file2);
        // 通过父路径和子路径字符串
        String parent = "d:\\aaa";
        String child = "bbb.txt";
        File file3 = new File(parent, child);
        System.out.println(file3);
        // 通过父级File对象和子路径字符串
        File parentDir = new File("d:\\aaa");
        String child1 = "bbb.txt";
        File file4 = new File(parentDir, child1);
        System.out.println(file4);

        File f = new File("d:/aaa/bbb.java");
        System.out.println("文件绝对路径:"+f.getAbsolutePath());
        System.out.println("文件构造路径:"+f.getPath());
        System.out.println("文件名称:"+f.getName());
        System.out.println("文件长度:"+f.length()+"字节");
        File f2 = new File("d:/aaa");
        System.out.println("目录绝对路径:"+f2.getAbsolutePath());
        System.out.println("目录构造路径:"+f2.getPath());
        System.out.println("目录名称:"+f2.getName());
        System.out.println("目录长度:"+f2.length());

        // D盘下的bbb.java文件
        File f3 = new File("D:\\bbb.java");
        System.out.println(f3.getAbsolutePath());
        // 项目下的bbb.java文件
        File f4 = new File("bbb.java");
        System.out.println(f4.getAbsolutePath());

        File f5 = new File("d:\\aaa\\bbb.java");
        File f6 = new File("d:\\aaa");
        // 判断是否存在
        System.out.println("d:\\aaa\\bbb.java 是否存在:"+f5.exists());
        System.out.println("d:\\aaa 是否存在:"+f6.exists());
        // 判断是文件还是目录
        System.out.println("d:\\aaa 文件?:"+f6.isFile());
        System.out.println("d:\\aaa 目录?:"+f6.isDirectory());

        // 文件的创建
        File f7 = new File("aaa.txt");
        System.out.println("是否存在:"+f7.exists()); // false
        System.out.println("是否创建:"+f7.createNewFile()); // true
        System.out.println("是否存在:"+f7.exists()); // true

        // 目录的创建
        File f8= new File("newDir");
        System.out.println("是否存在:"+f8.exists());// false
        System.out.println("是否创建:"+f8.mkdir()); // true
        System.out.println("是否存在:"+f8.exists());// true

        // 创建多级目录
        File f9= new File("newDira\\newDirb");
        System.out.println(f9.mkdir());// false
        File f10= new File("newDira\\newDirb");
        System.out.println(f10.mkdirs());// true
        // 文件的删除
        System.out.println(f7.delete());// true
        // 目录的删除
        System.out.println(f8.delete());// true
        System.out.println(f10.delete());// false

        File dir = new File("d:\\java_code");
        //获取当前目录下的文件以及文件夹的名称。
        String[] names = dir.list();
        for(String name : names){
            System.out.println(name);
        }
        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
