package homework.day19.test8;

import homework.day19.test7.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(("C:stu.txt")));
        // 调用对象输出流对象的方法将学生对象保存到文件中
        Student len = null;
        len = (Student) stream.readObject();
        System.out.println(len.getName() + "," + len.getGender() + "," + len.getAge());
        // 关闭流释放资源
        stream.close();
    }
}
