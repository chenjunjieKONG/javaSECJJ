package homework.day21.test4;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        //使用反射机制创建该类的对象，并调用该对象的 show 方法。
        Class<Sut> c=Sut.class;
        Method method=c.getMethod("show");
        method.invoke(c.newInstance());
    }
}
