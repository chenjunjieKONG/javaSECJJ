package homework.day18.customs3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        File file = new File(str);
        show(file);
    }

    public static File[] stu(File file) {
        File[] files = file.listFiles(file1 -> {
            return file1.getName().endsWith(".java") && file1.isFile();
        });
        return files;
    }

    public static void showt(FileInputStream inputStream,FileOutputStream outputStream ) throws IOException {
        int len;
        while ((len = inputStream.read()) != -1) {
            outputStream.write(len);
        }
    }
    public static void show(File file) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        int count = 0;
        int num = random.nextInt(10) + 1;
        for (File listFile : file.listFiles()) {
            File[] files = stu(listFile);
            for (File file1 : files) {
                FileInputStream inputStream = new FileInputStream(file1);
                if (file1.isFile()) {
                    if (list.contains(file1.getName())) {
                        String[] s = (file1.getName()).split("\\.");
                        String str=s[0]+(num+"")+"."+s[1];
                        list.add(str);
                        FileOutputStream outputStream = new FileOutputStream("D:/java" + "/" +str);
                        showt(inputStream,outputStream);
                        count++;
                    }else {
                        FileOutputStream outputStream = new FileOutputStream("D:/java" + "/" +file1.getName());
                        list.add(file1.getName());
                        showt(inputStream,outputStream);
                        count++;
                    }
                } else {
                    show(listFile);
                }
            }
        }
        System.out.println(count);
    }

}
