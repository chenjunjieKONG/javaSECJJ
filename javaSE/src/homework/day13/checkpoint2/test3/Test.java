package homework.day13.checkpoint2.test3;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        // 定义QQ号码数组String[] strs
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        // 创建LinkedList
        LinkedList<String> list=new LinkedList<>();
        // 遍历strs获取每个qq号码
        for (String str : strs) {
            // 判断LinkedList是否已经存在这个qq号码
            if(!list.contains(str)){
                list.add(str);// 不存在这个qq号码则添加到LinkedList中
            }
        }
        // 增强for遍历LinkedList
        for (String s : list) {
            System.out.println(s);
        }
        // 迭代器遍历LinkedList
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String string=it.next();
            System.out.println(string);
        }
    }
}
