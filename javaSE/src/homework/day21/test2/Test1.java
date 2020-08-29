package homework.day21.test2;

import java.lang.reflect.Method;
import java.util.ArrayList;


public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        try {
            Method method=arrayList.getClass().getMethod("add", Object.class);
            method.invoke(arrayList,1);
            method.invoke(arrayList,2);
            method.invoke(arrayList,"华天");
            method.invoke(arrayList,4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(arrayList);
    }
}
