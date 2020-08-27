package homework.day17.censorship2.test3;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file=new File("C:/QMDownload");
        get(file);
    }
    public static void get(File file){
        for (File listFile : file.listFiles()) {
            if(listFile.isFile()){
                System.out.println(listFile.getAbsolutePath());
            }else {
                get(listFile);
            }
        }
    }
}
