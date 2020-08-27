package homework.day12.Checkpoint2.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // 定义ArrayList
        Collection<Student> coll = new ArrayList<>();
        Student student1 = new Student("小明", 18, 80);
        Student student2 = new Student("小龙", 20, 60);
        Student student3 = new Student("小天", 19, 70);
        Student student4 = new Student("小新", 20, 40);
        Student student5 = new Student("小林", 17, 90);
        //添加5个学生
        coll.add(student1);
        coll.add(student2);
        coll.add(student3);
        coll.add(student4);
        coll.add(student5);
        Iterator<Student> it = coll.iterator();
        int sum = 0;//定义总分
        int max = 0;//定义最高分
        int min = ((ArrayList<Student>) coll).get(0).getScore();//定义最低分
        while (it.hasNext()) {//循环判断是否有下一个学生
            int num = it.next().getScore();//使用next方法获取学生对象
            sum += num;//将这个学生对象的分数添加到总分
            if (max < num) {//判断这个学生的分数是否大于最大分数
                max = num;//这个学生的分数大于最大分数.最大分数等于这个学生的分数
            }
            if (min > num) {//判断这个学生的分数是否大低最大分数
                min = num;//这个学生的分数小于最小分数.最小分数等于这个学生的分数
            }
        }
        int avg = sum / coll.size();
        System.out.println("总分:" + sum + ",平均分:" + avg + ",最高分:" + max + ",最低分:" + min);
    }
}
