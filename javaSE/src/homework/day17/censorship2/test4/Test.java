package homework.day17.censorship2.test4;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file=new File("c:/aaa");
        Filter filter=new Filter();
        for (File listFile : file.listFiles(filter)) {
            System.out.println(listFile.getName());
        }
    }
}
