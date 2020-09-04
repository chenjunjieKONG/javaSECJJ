package homework.day21.test6;

import java.lang.reflect.Field;

public class Obj {
    public String propertyName;

    public void setProperty(Object obj, String propertyName, Object value){
        try {
            //获取obj的class对象
            Class c=obj.getClass();
            //获取对象中的propertyName
            Field field = c.getField(propertyName);
            //替换propertyName的值
            field.set(obj,value);
            //输出propertyName的值
            System.out.println(field.get(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getProperty(Object obj, String propertyName){
        try {
            //获取obj的class对象
            Class c=obj.getClass();
            //获取对象中的propertyName
            Field field = c.getField(propertyName);
            //返回propertyName的值
            return field.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }
}
