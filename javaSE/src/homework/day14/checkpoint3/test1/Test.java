package homework.day14.checkpoint3.test1;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //创建基础班集合
        HashMap<String, String> basics = new HashMap<>();
        //把数据添加到基础班集合中
        basics.put("001", "李晨");
        basics.put("002", "范冰冰");
        //创建就业班集合
        HashMap<String, String> employment = new HashMap<>();
        //把数据添加到就业班集合中
        employment.put("001", "马云");
        employment.put("002", "马化腾");
        //创建小米科技集合
        HashMap<String, HashMap> hashMap = new HashMap<>();
        //把班级添加到小米科技集合中
        hashMap.put("java基础班", basics);
        hashMap.put("java就业班", employment);
        // 使用keySet和增强for遍历出里面的元素
        for (String s : hashMap.keySet()) {
            System.out.println(s + "=" + hashMap.get(s));
        }
        System.out.println("************");
        // 使用entrySet和迭代器遍历出里面的元素
        for (Map.Entry<String, HashMap> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
