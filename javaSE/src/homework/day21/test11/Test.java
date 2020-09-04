package homework.day21.test11;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {

        Class<Test1> t = Test1.class;
        Test1 instance = t.newInstance();
        Method[] methods = t.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(instance);
            }
        }
    }

}
