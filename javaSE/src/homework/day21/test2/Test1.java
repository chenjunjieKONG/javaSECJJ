package homework.day21.test2;

import java.lang.reflect.Method;
import java.util.ArrayList;


public class Test1 {
    public static void main(String[] args) {
        //定义一个ArrayList集合
        ArrayList<Integer> arrayList=new ArrayList<>();
        try {
            //获取ArrayList的add方法
            Method add=arrayList.getClass().getMethod("add", Object.class);
            //给集合添加数据
            add.invoke(arrayList,1);
            add.invoke(arrayList,2);
            //在集合中添加String类型的内容
            add.invoke(arrayList,"华天");
            add.invoke(arrayList,4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(arrayList);
    }
}
