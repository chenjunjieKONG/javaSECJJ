package homework.day21.test7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        Class<Person> c=Person.class;
        try {
            Constructor<Person> constructor=c.getConstructor();
            Person person =constructor.newInstance();
            Method method=c.getMethod("setName", String.class);
            method.invoke(person, "天下");
            Field field=c.getDeclaredField("age");
            field.setAccessible(true);
            field.set(person,100);
            System.out.println(person.getName()+","+person.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
