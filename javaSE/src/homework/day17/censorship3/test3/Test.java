package homework.day17.censorship3.test3;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        File file=new File(str);
        show(file,"docx");
        show(file,"xlsx");
        show(file,"txt");
    }
    public static void show(File file,String str){
        File[] files = file.listFiles(f -> {
            return f.getName().endsWith(str) && f.isFile();
        });
        int count=1;
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (File file1 : files) {
            if(file1.isFile()){
                hashMap.put(str,count++);
            }else {
                show(file1,str);
            }
        }
        for (String s : hashMap.keySet()) {
            System.out.println(s+"的类型的文件有"+hashMap.get(s)+"个");
        }

    }
}
