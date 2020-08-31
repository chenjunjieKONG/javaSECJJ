package homework.day21.test8;

import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建Properties集合
        Properties properties = new Properties();
        //获取Properties配置文件中的数据添加到Properties集合中
        properties.load(Test.class.getResourceAsStream("/homework/day21/test8/test.properties"));
        //根据Properties的键获取到类名，并获取calss对象
        Class c = Class.forName(properties.getProperty("class"));
        //创建对象
        Object instance = c.newInstance();
        //调用方法
        Method method = c.getMethod("run");
        method.invoke(instance);
    }
}
