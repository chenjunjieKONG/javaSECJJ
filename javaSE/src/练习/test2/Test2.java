package 练习.test2;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test2 {
    @Test
    public void dome() throws Exception {
        Class<Student> c=Student.class;
        Constructor<Student> declaredConstructor = c.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Student student = declaredConstructor.newInstance();
        Method eat = c.getDeclaredMethod("eat");
        Method studyX = c.getDeclaredMethod("studyX");
        studyX.setAccessible(true);
        studyX.invoke(student);
        eat.invoke(student);
    }
    @Test
    public void dome1() throws Exception {

        Class c=Class.forName("java.util.ArrayList");
        Constructor[] declaredConstructor = c.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructor) {
            System.out.println(constructor);
        }
        System.out.println("=================");
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }

    }

}
