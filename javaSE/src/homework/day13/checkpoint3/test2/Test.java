package homework.day13.checkpoint3.test2;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<Student> classList1=new HashSet<>();//班级
        //定义学生HashSet
        Student student1=new Student("小明",20);
        Student student2=new Student("小天",20);
        //添加学生到班级1集合里
        classList1.add(student1);
        classList1.add(student2);
        HashSet<Student> classList2=new HashSet<>();//班级
        //定义学生HashSet
        Student student3=new Student("小花",20);
        Student student4=new Student("小明",20);
        //添加学生到班级2集合里
        classList2.add(student3);
        classList2.add(student4);
        HashSet<HashSet> subjectList=new HashSet<>();
        //把班级1和班级2添加到学科集合里
        subjectList.add(classList1);
        subjectList.add(classList2);
        //用增强for循环遍历学科集合，并打印出所有学生。
        for (HashSet<Student> set : subjectList) {
            for (Student student : set) {
                System.out.println(student.getName()+","+student.getAge());
            }
        }
        System.out.println("----------------------");
        //用迭代器遍历学科集合，并打印出所有学生。
        Iterator<HashSet> it=subjectList.iterator();
        while (it.hasNext()){
            Iterator<Student> iterator=it.next().iterator();
            while (iterator.hasNext()){
                Student student=iterator.next();
                System.out.println(student.getName()+","+student.getAge());
            }
        }
    }
}
