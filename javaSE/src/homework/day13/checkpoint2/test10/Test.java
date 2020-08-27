package homework.day13.checkpoint2.test10;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //创建HashSet,用于存放学生
        HashSet<Student> hashSet=new HashSet<>();
        // 使用add方法添加5个学生
        Student student1=new Student("小明",20,90);
        Student student2=new Student("小天",20,70);
        Student student3=new Student("小芳",21,90);
        Student student4=new Student("小天",22,40);
        Student student5=new Student("小明",20,90);
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        hashSet.add(student5);
        // 使用迭代器获取一个学生.
        Iterator<Student> it=hashSet.iterator();
        Student stu=it.next();
        // 定义总分变量
        int sum=0;
        // 定义最高分变量,初始化值为迭代出来的学生的成绩
        int max=stu.getScore();
        // 定义最低分变量,初始化值为迭代出来的学生的成绩
        int min=stu.getScore();
        // 使用增强for循环获取遍历HashSet,获取到每个学生
        for (Student student : hashSet) {
            sum+=student.getScore();// 在增强for中将学生的分数添加到总分
            // 在增强for中判断最高分是否小于这个学生的分数,如果最高分小于这个学生的分数,将这个学生的分数设置为最高分
            if(max<student.getScore()){
                max=student.getScore();
            }
            // 在增强for中判断最低分是否大于这个学生的分数,如果最低分大于这个学生的分数,将这个学生的分数设置为最低分
            if(min>student.getScore()){
                min=student.getScore();
            }
        }
        // 计算平均分(平均分 = 总分 / 人数)
        int age=sum/hashSet.size();
        System.out.println("总分："+sum);
        System.out.println("平均分："+age);
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);
    }
}
