package homework.day21.test7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        //创建Person的class对象
        Class<Person> c = Person.class;
        try {
            //获取class对象的构造方法
            Constructor<Person> constructor = c.getConstructor();
            //实例化Person对象
            //调用构造函数初始化name、age。
            Person person = constructor.newInstance();
            //获取对象中的setName方法，用于赋值
            Method method = c.getMethod("setName", String.class);
            // 使用反射方式调用setName方法对姓名进行设置
            method.invoke(person, "天下");
            //不使用setAge方法直接使用反射方式对age赋值。
            Field field = c.getDeclaredField("age");
            field.setAccessible(true);//暴力反射
            field.set(person, 100);
            System.out.println(person.getName() + "," + person.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
