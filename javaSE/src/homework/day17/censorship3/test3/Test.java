package homework.day17.censorship3.test3;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        File file=new File(str);
        show(file);
    }
    public static void show(File file){
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (File file1 : file.listFiles()) {
            if(file1.isFile()){
                String[] str=file1.getName().split("\\.");
                if(!hashMap.containsKey(str[1])){
                    hashMap.put(str[1],1);
                }else {
                    hashMap.put(str[1],hashMap.get(str[1])+1);
                }
            }else {
                show(file1);
            }
        }
        for (String s : hashMap.keySet()) {
            System.out.println(s+"的类型的文件有"+hashMap.get(s)+"个");
        }
        System.out.println("-----------------");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+"的类型的文件有"+entry.getValue()+"个");
        }
    }
}
