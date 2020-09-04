package 练习;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListSize {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        System.out.println(listSize(list));
        list.add(1);
        System.out.println(listSize(list));
        for (int i=0;i<=10;i++){
            list.add(i);
        }
        System.out.println(listSize(list));
        for (int i=0;i<=5;i++){
            list.add(i);
        }
        System.out.println(listSize(list));
    }
    public static Integer listSize(ArrayList list) {
        Integer len=null;
        Class c=list.getClass();
        try {
            Field elementData = c.getDeclaredField("elementData");
            elementData.setAccessible(true);
            Object[] o = (Object[]) elementData.get(list);
            len=o.length;
            return len;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return len;
    }
}
