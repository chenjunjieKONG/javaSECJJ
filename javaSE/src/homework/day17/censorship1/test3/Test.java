package homework.day17.censorship1.test3;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        // 创建文件对象指定路径为c:/bbb
        File file = new File("c:/bbb");
        // 调用文件对象创建文件夹的方法
        file.mkdir();
    }
}
