package homework.day14.checkpoint1.test7;

import homework.day14.checkpoint1.test6.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        // 创建HashMapkey保存学生家庭住址,value是学生对象
        HashMap<String, Student> hashMap = new HashMap<>();
        // 添加一批学生到HashMap中
        Student student1 = new Student("小明", 21);
        Student student2 = new Student("小天", 21);
        Student student3 = new Student("小明", 21);
        Student student4 = new Student("小白", 21);
        hashMap.put("广州", student1);
        hashMap.put("吴川", student2);
        hashMap.put("广州", student3);
        hashMap.put("天津", student4);
        // 使用keySet方式遍历Map
        Set<String> key = hashMap.keySet();
        Iterator<String> it = key.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str + "=" + hashMap.get(str).getName() + "," + hashMap.get(str).getAge());
        }
        // 使用entrySet方式遍历Map
        Set<Map.Entry<String, Student>> key1 = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> it1 = key1.iterator();
        while (it1.hasNext()) {
            Map.Entry<String, Student> bui = it1.next();
            System.out.println(bui.getKey() + "=" + bui.getValue().getName() + "," + bui.getValue().getAge());
        }
    }
}
