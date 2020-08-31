package homework.day21.test12;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Test1 {
    @Test
    public void TestMe() throws Exception {
        //获取字节码对象
        Class<MethodTest> methodClass= MethodTest.class;
        //通过类字节码对象获取类对象
        MethodTest methodTest=methodClass.newInstance();
        //通过类字节码对象获取方法对象
        Method method=methodClass.getMethod("show");
        //通过方法对象获取该方法上的注解
        Book book=method.getAnnotation(Book.class);
        //通过注解对象获取注解上的值
        String value = book.value();
        String[] authors = book.authors();
        double price = Book.price;
        method.invoke(methodTest);
        System.out.println("书名："+value+",价钱："+price+"元");
        System.out.print("作者："+ Arrays.toString(authors));
    }
}
