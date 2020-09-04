package homework.day21.test6;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        //获取Obj的class对象
        Class c = Obj.class;
        //创建obj对象
        Object o = c.newInstance();
        //获取对象中的setProperty方法
        Method method = c.getMethod("setProperty", Object.class, String.class, Object.class);
        //调用setProperty方法
        method.invoke(o, o, "propertyName", "789");
        //获取对象中的getProperty方法
        Method method1 = c.getMethod("getProperty", Object.class, String.class);
        //调用getProperty方法,获取propertyName的值
        System.out.println(method1.invoke(o, o, "propertyName"));
    }
}
