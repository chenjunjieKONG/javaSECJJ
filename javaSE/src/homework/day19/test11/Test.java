package homework.day19.test11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        //定义list集合，用于存储Student对象
        List<Student> list=new ArrayList<>();
        //对象实例化
        Student student1=new Student("小明",23,"男");
        Student student2=new Student("小白",23,"男");
        Student student3=new Student("小天",23,"男");
        Student student4=new Student("小红",23,"女");
        //把对象添加进集合中
        Collections.addAll(list,student1,student2,student3,student4);
        //创建对象输出流，用于写入对象的数据
        ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("stus.txt"));
        //写入数据
        stream.writeObject(list);
        //关闭流并释放资源
        stream.close();
    }
}
