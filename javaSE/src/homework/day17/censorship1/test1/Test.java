package homework.day17.censorship1.test1;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //绝对路径
        String paren = "D:\\123.txt";
        File file1 = new File(paren);
        //相对路径
        String parent = "d:\\aaa";
        String child = "bbb.txt";
        File file2 = new File(parent, child);
    }
}
