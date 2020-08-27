package homework.day13.checkpoint1.test7;

import java.util.Collections;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        //创建HashSet用于存储Person类型
        HashSet<Person> hashSet=new HashSet<>();
        //添加多个Person到HashSet中
        Person person1=new Person("小明",20);
        Person person2=new Person("小红",20);
        Person person3=new Person("小红",32);
        Person person4=new Person("小明",20);
        Collections.addAll(hashSet,person1,person2,person3,person4);
        //遍历获取HashSet中的内容
        for (Person person : hashSet) {
            System.out.println(person.getName()+","+person.getAge());
        }
    }
}
