package homework.day21.test6;

import java.lang.reflect.Field;

public class Obj {
    public String propertyName;

    public Obj() {
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public void setProperty(Object obj, String propertyName, Object value){
        try {
            Class c=obj.getClass();
            System.out.println(obj);
            Field field = c.getField(propertyName);
            field.set(obj,value);
            Object o=field.get(obj);
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getProperty(Object obj, String propertyName){
        Class c=obj.getClass();
        try {
            Field field = c.getField(propertyName);
            Object o1 = field.get(obj);
            return o1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
}
