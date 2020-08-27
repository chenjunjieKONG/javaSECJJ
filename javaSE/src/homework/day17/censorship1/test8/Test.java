package homework.day17.censorship1.test8;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        // 创建文件对象关联到指定文件夹
        File file = new File("c:/aaa");
        // 调用文件对象的listFiles方法获得文件数组,遍历文件数组将每一个文件的名字输出到控制台
        for (File listFile : file.listFiles()) {
            System.out.println(listFile);
        }
    }
}
