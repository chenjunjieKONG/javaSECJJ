package homework.day19.test11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Student> list=new ArrayList<>();
        Student student1=new Student("小明",23,"男");
        Student student2=new Student("小白",23,"男");
        Student student3=new Student("小天",23,"男");
        Student student4=new Student("小红",23,"女");
        Collections.addAll(list,student1,student2,student3,student4);
        ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("stus.txt"));
        stream.writeObject(list);
        stream.close();
    }
}
