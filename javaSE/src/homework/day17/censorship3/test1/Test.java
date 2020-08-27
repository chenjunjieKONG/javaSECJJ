package homework.day17.censorship3.test1;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //创建文件对象，并指定文件路径
        File file=new File("c:/aaa");
        //调用方法
        comtnu(file);
    }
    public static void comtnu(File file){
        //过滤文件长度小于200的文件
        File[] files = file.listFiles(file1 -> {
            return file.length()<200;
        });
        //遍历文件数组
        for (File file1 : files) {
            if(file1.isFile()){//判断文件的是不是文件
                System.out.println(file1);
            }else {
                comtnu(file1);//递归
            }
        }
    }
}
