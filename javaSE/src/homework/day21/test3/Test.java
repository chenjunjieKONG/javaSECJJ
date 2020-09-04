package homework.day21.test3;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        // 通过Class对象的方法创建。
        Class c=Student.class;
        System.out.println(c.newInstance());
        // 通过Constructor对象的方法创建。
        Constructor<Student> constructor=Student.class.getConstructor();
        Student student=constructor.newInstance();
        System.out.println(student);
    }
}
