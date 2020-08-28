package homework.day17.censorship3.test4;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        File file=new File(str);
        System.out.println(file.getName());
        show(file);
    }
    public static void show(File file){
        for (File listFile : file.listFiles()) {
            if(listFile.isFile()){
                System.out.println(listFile.getName());
            }else {
                System.out.println(listFile.getName());
                show(listFile);
            }
        }
    }
}
