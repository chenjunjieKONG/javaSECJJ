package homework.day17.censorship1.test4;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        // 创建文件对象关联路径：c:/ccc/bbb/aaa
        File file=new File("c:/ccc/bbb/aaa");
        // 调用文件对象创建多级文件夹的方法
        file.mkdirs();
    }
}
