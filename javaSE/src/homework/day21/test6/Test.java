package homework.day21.test6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {

        Class c=Obj.class;

        try {
            Object o = c.newInstance();
            Method method=c.getMethod("setProperty", Object.class, String.class, Object.class);
            method.invoke(o,o,"propertyName","456");
            Method method1=c.getMethod("getProperty", Object.class, String.class);
            System.out.println(method1.invoke(o, o, "propertyName"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
