package homework.day13.checkpoint1.test8;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        //创建LinkedHashSet
        LinkedHashSet<String> linke = new LinkedHashSet<>();
        //使用add方法添加元素到LinkedHashSet
        linke.add("王昭君");
        linke.add("王昭君");
        linke.add("西施");
        linke.add("杨玉环");
        linke.add("貂蝉");
        //使用迭代器获取LinkedHashSet中的元素
        Iterator<String> it = linke.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        //使用增强for获取LinkedHashSet中的元素
        for (String s : linke) {
            System.out.println(s);
        }
    }
}
