package homework.day19;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "zhangsan";
        e.address = "beiqinglu";
        e.age = 20;
        try {
// 创建序列化流对象
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.txt"));
// 写出对象
            out.writeObject(e);
// 释放资源
            out.close();
            System.out.println("Serialized data is saved"); // 姓名，地址被序列化，年龄没有被序列化。
        } catch (IOException i) {
            i.printStackTrace();
        }
//        Employee e = null;
//        try {
//// 创建反序列化流
//            FileInputStream fileIn = new FileInputStream("employee.txt");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//// 读取一个对象
//            e = (Employee) in.readObject();
//// 释放资源
//            in.close();
//            fileIn.close();
//        }catch(IOException i) {
//// 捕获其他异常
//            i.printStackTrace();
//            return;
//        }catch(ClassNotFoundException c) {
//// 捕获类找不到异常
//            System.out.println("Employee class not found");
//            c.printStackTrace();
//            return;
//        }
//// 无异常,直接打印输出
//        System.out.println("Name: " + e.name); // zhangsan
//        System.out.println("Address: " + e.address); // beiqinglu
//        System.out.println("age: " + e.age); // 0

    }

}
