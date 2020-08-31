package homework.day19.test7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        // 定义学生类并实现序列化接口和测试类
        // 在测试类中创建学生对象
        Student student = new Student("小明", 20, "男");
        // 创建文件字节输出流对象并关联目标文件
        // 根据文件字节输出流对象创建对象输出流对象
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(("C:stu.txt")));
        // 调用对象输出流对象的方法将学生对象保存到文件中
        stream.writeObject(student);
        // 关闭流释放资源
        stream.close();
    }
}
