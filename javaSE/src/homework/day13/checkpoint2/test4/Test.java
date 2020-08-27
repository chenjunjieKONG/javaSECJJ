package homework.day13.checkpoint2.test4;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<Student> hashSet=new HashSet<>();
        //使用Student类创建10个学生,把这10个学生添加到Set集合中
        Student student0=new Student("小明",20,"男");
        Student student1=new Student("小天",20,"男");
        Student student2=new Student("小红",21,"女");
        Student student3=new Student("小明",20,"男");
        Student student4=new Student("小林",21,"男");
        Student student5=new Student("小天",20,"男");
        Student student6=new Student("小红",21,"女");
        Student student7=new Student("小百",20,"男");
        Student student8=new Student("小林",21,"男");
        Student student9=new Student("小芳",20,"女");
        hashSet.add(student0);
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        hashSet.add(student5);
        hashSet.add(student6);
        hashSet.add(student7);
        hashSet.add(student8);
        hashSet.add(student9);
        //使用迭代器遍历HashSet
        Iterator<Student> it=hashSet.iterator();
        while (it.hasNext()){
            Student s=it.next();
            System.out.println(s.getName()+","+s.getAge()+","+s.getGender());
        }
        System.out.println("---------------------");
        //使用增强for遍历集合
        for (Student student : hashSet) {
            System.out.println(student.getName()+","+student.getAge()+","+student.getGender());
        }
    }
}
