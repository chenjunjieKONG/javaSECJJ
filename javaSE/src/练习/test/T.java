package 练习.test;

import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class T {

    static Class<Student> studentClass;

    @BeforeClass
    public static void before() {
        studentClass = Student.class;
    }
    //反射构造方法
    @Test
    public void test1() {//反射所有public 修饰的构造方法
        System.out.println("获取所有public 修饰的构造方法");
        Constructor<?>[] constructors = studentClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("--------------");
    }

    @Test
    public void test2() {//反射所有的构造方法
        System.out.println("获取所有修饰的构造方法");
        Constructor<?>[] constructors = studentClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }

    @Test
    public void test3() {//反射私有的构造方法
        try {
            //获取任何修饰符修饰的构造方法
            Constructor<Student> constructor = studentClass.getDeclaredConstructor(String.class, String.class);
            //暴力反射
            constructor.setAccessible(true);
            //根据指定的构造器创建对象
            Student student = constructor.newInstance("张三", "男");

            System.out.println(student);
            System.out.println("---------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4() {//反射protected修饰的构造方法
        //获取任何修饰符修饰的构造方法(注意：getConstructor只能获取public修饰的构造)
        try {
            //获取任何修饰符修饰的构造方法
            Constructor<Student> constructor = studentClass.getDeclaredConstructor(String.class, int.class);
            //暴力反射(只要不是public修饰的都需要暴力反射)
            constructor.setAccessible(true);
            //根据指定的构造器创建对象
            Student student = constructor.newInstance("张三", 50);

            System.out.println(student);
            System.out.println("---------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test6() throws Exception { //反射public修饰的构造方法
        //获取构造器对象
        Constructor<Student> dc = studentClass.getConstructor(String.class, String.class, int.class);
        //根据指定的构造器创建对象
        Student student = dc.newInstance("张三", "男", 20);
        System.out.println(student);
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐");
    }
    /*---------------------------------------------*/
    //反射方法
    @Test
    public void test7() throws Exception { //反射字节码对象对应的所有公有方法(继承下来的方法也会返回)
        Method[] methods = studentClass.getMethods();
        for(Method method:methods){
            System.out.println(method);
        }
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐");
    }
    @Test
    public void test8() throws Exception { //反射公有方法
        Student student = studentClass.newInstance();
        Method method = studentClass.getMethod("eat");
        Object invoke = method.invoke(student);
        System.out.println(invoke);
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐");
    }
    @Test
    public void test9() throws Exception { //反射公有有参方法
        Student student = studentClass.newInstance();
        Method method = studentClass.getMethod("sleep", int.class);
        Object invoke = method.invoke(student,20);
        System.out.println(invoke);
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐");
    }
    @Test
    public void test10() throws Exception { //反射私有方法
        Student student = studentClass.newInstance();
        Method method = studentClass.getDeclaredMethod("show");
        method.setAccessible(true);
        Object invoke = method.invoke(student);
        System.out.println(invoke);
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐");
    }
    @Test
    public void test11() throws Exception { //反射静态方法
        Student student = studentClass.newInstance();
        Method method = studentClass.getMethod("study");
// Object invoke = method.invoke(student);
        Object invoke = method.invoke(null); //静态方法可以不用对象来调用
        System.out.println(invoke);
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐");
    }
    @Test
    public void test12() throws Exception { //反射私有静态方法
        Student student = studentClass.newInstance();
        Method method = studentClass.getDeclaredMethod("studyX");
        method.setAccessible(true); //暴力反射
// Object invoke = method.invoke(student);
        Object invoke = method.invoke(null); //静态方法可以不用对象来调用
        System.out.println(invoke);
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐");
    }
    /*---------------------------------------------*/
    //反射字段
    @Test
    public void test13(){ //反射所有公有的字段
        Field[] fields = studentClass.getFields();
        for(Field field:fields){
            System.out.println(field);
        }
        System.out.println("‐‐‐‐‐‐‐‐‐");
    }
    @Test
    public void test14() throws Exception { //反射公有字段
        Student student = studentClass.newInstance();
        Field field = studentClass.getField("sex");
        field.set(student,"男");
        Object o = field.get(student);
        System.out.println(o);
    }
    @Test
    public void test15() throws Exception { //反射私有字段
        Student student = studentClass.newInstance();
        Field field = studentClass.getDeclaredField("name");
        //暴力反射
        field.setAccessible(true);
        field.set(student,"张三");
        Object o = field.get(student);
        System.out.println(o);
    }




//    public static void main(String[] args) throws ClassNotFoundException {
////        // 获得Student的Class的对象
////        Class c = Student.class;
////        // 打印输出：class com.dfbz.reflect.Student
////        System.out.println(c);
////        // 创建学生对象
////        Student stu = new Student();
////        // 获得学生类的Class对象
////        Class c1 = stu.getClass();
////        // 打印输出：class com.dfbz.reflect.Student
////        System.out.println(c1);
////        // 获得字符串的Class对象
////        Class c2 = Class.forName("java.lang.String");
////        // 打印输出：class java.lang.String
////        System.out.println(c2);
//    }
}
