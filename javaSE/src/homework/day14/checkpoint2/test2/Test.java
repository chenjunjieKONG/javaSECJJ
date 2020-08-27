package homework.day14.checkpoint2.test2;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        // 定义HashMap,姓名作为key,工资作为value
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 使用put方法添加需要的元素
        hashMap.put("柳岩", 2100);
        hashMap.put("张亮", 1700);
        hashMap.put("诸葛亮", 1800);
        hashMap.put("灭绝师太", 2600);
        hashMap.put("东方不败", 3800);
        // 获取到柳岩的工资
        Integer num = hashMap.get("柳岩");
        // 修改柳岩的工资为当前工资加上300
        hashMap.put("柳岩", num + 300);
        // 使用增强for+keySet迭代出每个员工的工资
        for (String s : hashMap.keySet()) {
            System.out.println(s + "=" + hashMap.get(s));
        }
    }
}
