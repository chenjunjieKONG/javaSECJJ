package 练习.test;

public class T {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获得Student的Class的对象
        Class c = Student.class;
        // 打印输出：class com.dfbz.reflect.Student
        System.out.println(c);
        // 创建学生对象
        Student stu = new Student();
        // 获得学生类的Class对象
        Class c1 = stu.getClass();
        // 打印输出：class com.dfbz.reflect.Student
        System.out.println(c1);
        // 获得字符串的Class对象
        Class c2 = Class.forName("java.lang.String");
        // 打印输出：class java.lang.String
        System.out.println(c2);

    }
}
