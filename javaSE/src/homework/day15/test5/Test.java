package homework.day15.test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Child child=new Child();
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"陈","路","白","龙","明","水","王","云","刘","黄");
        Collections.sort(list);
        for (int i = 0; i < 10; i++) {
            Thread t=new Thread(child,list.get(i));
            t.start();
        }
    }
}
