package 练习.tests;

import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

public class Thien {
    public static void main(String[] args){
// 获取对象
        Student stu = (Student) createObject();
// 输出对象
        System.out.println(stu);
    }
    /**
     * 根据配置文件创建对象
     */
    public static Object createObject(){
        try {
// 创建属性集合
            Properties pro = new Properties();
// 从文件中加载内容到集合中
            pro.load(Thien.class.getResourceAsStream("/homework/day21/test8/test.properties"));
// 从集合中获得类名
            String className = pro.getProperty("class");
// 通过反射获得Class对象
            Class c = Class.forName(className);
// 快速创建对象
            Object obj = c.newInstance();
// 遍历集合
            Set<String> names = pro.stringPropertyNames();
            for (String name : names) {
// 判断name是否class
                if (name.equals("class")) continue;
// 获得值
                String value = pro.getProperty(name);
// name：成员变量名
// 根据成员变量名获得对应的Field对象
                Field f = c.getDeclaredField(name);
// 暴力反射
                f.setAccessible(true);
// 获得成员变量的类型
                Class typeClass = f.getType();
                if(typeClass == int.class){ // 判断成员变量的数据类型是否是int类型
                    f.setInt(obj, Integer.parseInt(value));
                } else {
// 给f对象的赋值
                    f.set(obj, value);
                }
            }
// 返回对象
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
